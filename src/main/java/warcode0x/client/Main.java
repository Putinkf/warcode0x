package warcode0x.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;
import warcode0x.client.event.EventBus;
import warcode0x.client.gui.clickgui.ClickGUI;
import warcode0x.client.gui.clickgui.Frame;
import warcode0x.client.gui.clickgui.ModuleButton;
import warcode0x.client.input.KeyHook;
import warcode0x.client.module.Category;
import warcode0x.client.module.Module;
import warcode0x.client.module.ModuleManager;
import warcode0x.client.module.settings.KeyBindSetting;

public class Main {

    private static Main instance;
    private final EventBus eventBus;
    private final ClickGUI clickGUI;
    private final KeyBindSetting clickGuiBind;
    private final KeyHook keyHook;

    public Main() {
        instance = this;

        eventBus = new EventBus();

        // бинды
        clickGuiBind = new KeyBindSetting("ClickGUI", GLFW.GLFW_KEY_RIGHT_SHIFT);

        // ClickGUI
        clickGUI = new ClickGUI(ModuleManager.getInstance());

        // KeyHook
        keyHook = new KeyHook(this, eventBus);
        eventBus.register(keyHook);

        // инициализация GUI
        initGUI();
    }

    public static Main getInstance() {
        return instance;
    }

    private void initGUI() {
        int startX = 10;

        for (Category category : Category.values()) {
            Frame frame = new Frame(category, startX, 10, ModuleManager.getInstance());

            int buttonY = 15;
            for (Module module : ModuleManager.getInstance().getModulesByCategory(category)) {
                ModuleButton button =
                        new ModuleButton(module, frame.getX() + 5, frame.getY() + buttonY);
                frame.addButton(button);
                buttonY += 20;
            }

            clickGUI.addFrame(frame);
            startX += 130;
        }
    }

    // вызывается при нажатии клавиши
    public void onKeyPress(int key) {
        if (key == clickGuiBind.getValue()) {
            toggleClickGUI();
        }
    }

    // LWJGL window handle
    public long getWindowHandle() {
        return Minecraft.getInstance().getMainWindow().getHandle();
    }

    // открытие/закрытие ClickGUI
    public void toggleClickGUI() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.currentScreen == null) {
            mc.displayGuiScreen(clickGUI);
        } else {
            mc.displayGuiScreen(null);
        }
    }

    // метод для каждого кадра — вызывает KeyHook
    public void tick() {
        keyHook.tick();
    }
}

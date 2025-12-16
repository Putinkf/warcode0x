package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.StringTextComponent;
import warcode0x.client.module.ModuleManager;

import java.util.ArrayList;
import java.util.List;

public class ClickGUI extends Screen {

    private final List<Frame> frames = new ArrayList<>();
    private final ModuleManager manager;

    public ClickGUI(ModuleManager manager) {
        super(new StringTextComponent("Warcode ClickGUI"));
        this.manager = manager;
    }

    public void addFrame(Frame frame) {
        frames.add(frame);
    }

    @Override
    public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
        super.render(ms, mouseX, mouseY, partialTicks);
        // Рисуем все фреймы
        for (Frame f : frames) {
            f.draw(ms, mouseX, mouseY);
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        for (Frame f : frames) {
            f.mouseClicked((int) mouseX, (int) mouseY, button);
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        for (Frame f : frames) {
            f.mouseReleased((int) mouseX, (int) mouseY, button);
        }
        return super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        for (Frame f : frames) {
            f.keyTyped(keyCode, scanCode); // Frame.keyTyped должен принимать int keyCode, int scanCode
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    // Для открытия GUI по дефолту (например, RSHIFT)
    public void open() {
        if (this.minecraft != null) {
            this.minecraft.displayGuiScreen(this);
        }
    }
}

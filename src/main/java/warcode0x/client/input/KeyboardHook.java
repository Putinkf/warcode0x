package warcode0x.client.input;

import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;
import warcode0x.client.Main;

public class KeyboardHook {

    private static boolean initialized = false;

    public static void init() {
        if (initialized) return;
        initialized = true;

        long window = Minecraft.getInstance()
                .getMainWindow()
                .getHandle();

        GLFW.glfwSetKeyCallback(window, (win, key, scancode, action, mods) -> {
            if (action == GLFW.GLFW_PRESS) {
                Main.getInstance().onKeyPress(key);
            }
        });
    }
}

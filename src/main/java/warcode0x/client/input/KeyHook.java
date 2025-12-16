package warcode0x.client.input;

import org.lwjgl.glfw.GLFW;
import warcode0x.client.Main;
import warcode0x.client.event.EventBus;

public class KeyHook {

    private final Main main;
    private final EventBus eventBus;
    private final boolean[] keysPressed = new boolean[GLFW.GLFW_KEY_LAST + 1];

    public KeyHook(Main main, EventBus eventBus) {
        this.main = main;
        this.eventBus = eventBus;
    }

    // проверка всех клавиш каждый тик
    public void tick() {
        for (int key = 0; key <= GLFW.GLFW_KEY_LAST; key++) {
            boolean pressed = GLFW.glfwGetKey(main.getWindowHandle(), key) == GLFW.GLFW_PRESS;

            if (pressed && !keysPressed[key]) {
                // клавиша только что нажата
                main.onKeyPress(key);
            }

            keysPressed[key] = pressed;
        }
    }
}

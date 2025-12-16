// KeyBindSetting.java
package warcode0x.client.module.settings;

import org.lwjgl.glfw.GLFW;

public class KeyBindSetting extends Setting<Integer> {

    public KeyBindSetting(String name, int defaultKey) {
        super(name, defaultKey);
    }

    public String getKeyName() {
        int key = getValue(); // текущее значение бинда
        return GLFW.glfwGetKeyName(key, 0) != null ? GLFW.glfwGetKeyName(key, 0) : "NONE";
    }
}

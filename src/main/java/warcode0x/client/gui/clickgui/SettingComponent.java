package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.settings.Setting;

public abstract class SettingComponent<T extends Setting<?>> {

    protected final T setting; // ✅ protected вместо private
    protected int x, y, width, height; // ✅ protected

    public SettingComponent(T setting, int x, int y, int width, int height) {
        this.setting = setting;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public T getSetting() {
        return setting;
    }

    public abstract void draw(MatrixStack ms, int mouseX, int mouseY);
    public abstract void keyTyped(char typedChar, int keyCode);
    public abstract void mouseClicked(int mouseX, int mouseY, int button);
    public abstract void mouseReleased(int mouseX, int mouseY, int state);
}

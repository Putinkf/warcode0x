package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.settings.KeyBindSetting;

public class KeybindComponent extends SettingComponent<KeyBindSetting> {

    public KeybindComponent(KeyBindSetting setting, int x, int y, int width, int height) {
        super(setting, x, y, width, height);
    }

    @Override
    public void draw(MatrixStack ms, int mouseX, int mouseY) {
        String text = "Bind: " + setting.getKeyName();
        GuiRender.drawString(ms, text, x + 2, y + 2, 0xFFFFFFFF);
    }

    @Override
    public void keyTyped(char typedChar, int keyCode) { }


    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {}

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {}
}

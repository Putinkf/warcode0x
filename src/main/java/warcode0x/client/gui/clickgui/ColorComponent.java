package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.settings.ColorSetting;

public class ColorComponent extends SettingComponent<ColorSetting> {

    public ColorComponent(ColorSetting setting, int x, int y, int width, int height) {
        super(setting, x, y, width, height); // setting теперь передаётся базовому классу
    }

    @Override
    public void draw(MatrixStack ms, int mouseX, int mouseY) {
        GuiRender.drawRect(ms, x, y, x + width, y + height, getSetting().getColor()); // через getSetting()
    }

    @Override
    public void keyTyped(char typedChar, int keyCode) { }


    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {}

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {}
}

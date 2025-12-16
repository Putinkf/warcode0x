package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.settings.BooleanSetting;

public class BooleanComponent extends SettingComponent<BooleanSetting> {

    public BooleanComponent(BooleanSetting setting, int x, int y, int width, int height) {
        super(setting, x, y, width, height);
    }

    @Override
    public void draw(MatrixStack ms, int mouseX, int mouseY) {
        GuiRender.drawRect(ms, x, y, x + width, y + height, setting.getValue() ? 0x9900FF00 : 0x99000000);
    }

    @Override
    public void keyTyped(char typedChar, int keyCode) { }


    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {
        if (mouseOver(mouseX, mouseY) && button == 0) setting.setValue(!setting.getValue());
    }

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {}

    private boolean mouseOver(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }
}

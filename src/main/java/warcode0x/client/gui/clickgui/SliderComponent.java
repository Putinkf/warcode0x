package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.settings.NumberSetting;

public class SliderComponent extends SettingComponent<NumberSetting> {

    public SliderComponent(NumberSetting setting, int x, int y, int width, int height) {
        super(setting, x, y, width, height);
    }

    @Override
    public void draw(MatrixStack ms, int mouseX, int mouseY) {
        double ratio = (setting.getValue() - setting.getMin()) / (setting.getMax() - setting.getMin());
        int sliderWidth = (int)(width * ratio);
        GuiRender.drawRect(ms, x, y, x + sliderWidth, y + height, 0xFF00FF00);
        GuiRender.drawRect(ms, x + sliderWidth, y, x + width, y + height, 0xFF555555);
    }

    @Override
    public void keyTyped(char typedChar, int keyCode) { }


    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {}

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {}
}

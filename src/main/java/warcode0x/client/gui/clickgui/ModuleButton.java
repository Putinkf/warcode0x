package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.Module;

public class ModuleButton {

    private final Module module;
    private int x, y, width = 110, height = 15;

    public ModuleButton(Module module, int x, int y) {
        this.module = module;
        this.x = x;
        this.y = y;
    }

    public void drawButton(MatrixStack stack, int mouseX, int mouseY) {
        GuiRender.drawRect(stack, x, y, x + width, y + height, module.isToggled() ? 0xFF00FF00 : 0xFF444444);
        GuiRender.drawString(stack, module.getName(), x + 5, y + 3, 0xFFFFFFFF);
    }

    public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
        if (mouseButton == 0 && mouseOver(mouseX, mouseY)) module.toggle();
    }

    public void mouseReleased(int mouseX, int mouseY, int state) { }

    public void keyTyped(char typedChar, int keyCode) { }

    private boolean mouseOver(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }
}

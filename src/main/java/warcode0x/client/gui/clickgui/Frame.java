package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import warcode0x.client.module.Category;
import warcode0x.client.module.Module;
import warcode0x.client.module.ModuleManager;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    private final Category category;
    private final List<ModuleButton> buttons = new ArrayList<>();
    private int x, y;

    public Frame(Category category, int x, int y, ModuleManager manager) {
        this.category = category;
        this.x = x;
        this.y = y;
    }

    public void addButton(ModuleButton button) {
        buttons.add(button);
    }

    public void draw(MatrixStack ms, int mouseX, int mouseY) {
        for (ModuleButton b : buttons) b.drawButton(ms, mouseX, mouseY);
    }

    public void mouseClicked(int mouseX, int mouseY, int button) {
        for (ModuleButton b : buttons) b.mouseClicked(mouseX, mouseY, button);
    }

    public void mouseReleased(int mouseX, int mouseY, int state) {
        for (ModuleButton b : buttons) b.mouseReleased(mouseX, mouseY, state);
    }

    public void keyTyped(int keyCode, int scanCode) {
        for (ModuleButton button : buttons) {
            button.keyTyped((char) keyCode, scanCode);
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

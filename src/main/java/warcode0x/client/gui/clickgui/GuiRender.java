package warcode0x.client.gui.clickgui;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;

public class GuiRender {
    public static void drawRect(MatrixStack ms, int x1, int y1, int x2, int y2, int color) {
        net.minecraft.client.gui.AbstractGui.fill(ms, x1, y1, x2, y2, color);
    }

    public static void drawString(MatrixStack ms, String text, int x, int y, int color) {
        Minecraft mc = Minecraft.getInstance();
        mc.fontRenderer.drawString(ms, text, x, y, color);
    }
}

package warcode0x.client.module.settings;

import java.awt.Color;

public class ColorSetting extends Setting<Integer> {

    public ColorSetting(String name, int defaultColor) {
        super(name, defaultColor);
    }

    public int getColor() {
        return getValue();
    }

    public Color getColorObject() {
        return new Color(getValue(), true);
    }
}

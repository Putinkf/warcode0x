package warcode0x.client.module.settings;

public class SliderSetting extends Setting<Float> {

    private final float min;
    private final float max;

    public SliderSetting(String name, Float defaultValue, float min, float max) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public float getMin() { return min; }
    public float getMax() { return max; }
}

package warcode0x.client.module.settings;

public class NumberSetting extends Setting<Double> {
    private final double min, max;

    public NumberSetting(String name, Double defaultValue, double min, double max) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public double getMin() { return min; }
    public double getMax() { return max; }
}

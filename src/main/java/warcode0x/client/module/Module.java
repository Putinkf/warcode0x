package warcode0x.client.module;

import warcode0x.client.module.settings.KeyBindSetting;

public abstract class Module {

    private final String name;
    private final Category category;
    private boolean enabled;

    private final KeyBindSetting bind;

    public Module(String name, Category category, int key) {
        this.name = name;
        this.category = category;
        this.bind = new KeyBindSetting(name + " Bind", key);
    }

    public void toggle() {
        enabled = !enabled;
        if (enabled) onEnable();
        else onDisable();
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (enabled) onEnable();
        else onDisable();
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public KeyBindSetting getBind() {
        return bind;
    }

    protected void onEnable() {}
    protected void onDisable() {}

    public boolean isToggled() {
        return false;
    }
}

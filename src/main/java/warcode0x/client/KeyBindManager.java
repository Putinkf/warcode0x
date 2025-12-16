package warcode0x.client;

import warcode0x.client.module.Module;
import warcode0x.client.module.settings.KeyBindSetting;

import java.util.HashMap;
import java.util.Map;

public class KeyBindManager {

    private final Map<Module, Integer> binds = new HashMap<>();

    public void bind(Module module, int keyCode) {
        binds.put(module, keyCode);
    }
    public int getBind(Module module) {
        return binds.getOrDefault(module, -1);
    }

    public void onKeyPress(int key) {
        for (Map.Entry<Module, Integer> entry : binds.entrySet()) {
            if (entry.getValue() == key) entry.getKey().toggle();
        }
    }
}

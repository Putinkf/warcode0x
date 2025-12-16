// warcode0x.client.event.events.KeyEvent
package warcode0x.client.event.events;

import warcode0x.client.event.Event;

public class KeyEvent extends Event {
    private final int key;

    public KeyEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}

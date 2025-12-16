package warcode0x.client.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private final List<Object> listeners = new ArrayList<>();

    public void register(Object listener) {
        if (!listeners.contains(listener)) listeners.add(listener);

    }

    public void unregister(Object listener) {
        listeners.remove(listener);
    }

    public void post(Event event) {
        for (Object listener : listeners) {
            for (Method method : listener.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) &&
                        method.getParameterCount() == 1 &&
                        method.getParameterTypes()[0].isAssignableFrom(event.getClass())) {
                    try {
                        method.setAccessible(true);
                        method.invoke(listener, event);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

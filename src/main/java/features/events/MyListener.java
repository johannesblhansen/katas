package features.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @EventListener
    public void onApplicationEvent(MyEvent event) {
        System.out.println("We got an event");
    }
}

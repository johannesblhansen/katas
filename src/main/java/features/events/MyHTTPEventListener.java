package features.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * Example of a special kind of spring event handler. Gets an event on every request is handled in the application context
 */
@Component
public class MyHTTPEventListener implements ApplicationListener<RequestHandledEvent> {

    private int i = 0;

    @Override
    public void onApplicationEvent(RequestHandledEvent event) {
        i++;
        System.out.println("Handling of a RequestHandledEvent - " + i + " Event text: " + event.getDescription());
    }
}

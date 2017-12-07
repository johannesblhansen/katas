package features.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private MyPublisher myPublisher;

    @RequestMapping("/event")
    public String doingEvent(){
        myPublisher.doPublish();
        return "Event";
    }

}

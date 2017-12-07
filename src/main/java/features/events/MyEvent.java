package features.events;

public class MyEvent {

    private String eventText;

    public MyEvent(String eventText){
        this.eventText = eventText;
    }

    public String getEventText(){
        return eventText;
    }
}

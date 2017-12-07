package features.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Apple {

    @Id
    private final String id = UUID.randomUUID().toString();

    private String appletype;

    public Apple(){}

    public Apple(String appletype){
        this.appletype = appletype;
    }

    public String getAppletype() {
        return appletype;
    }

    public void setAppletype(String appletype) {
        this.appletype = appletype;
    }
}


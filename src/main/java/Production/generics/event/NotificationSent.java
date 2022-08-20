package Production.generics.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NotificationSent extends DomainEvent {
    private final String message;

    public NotificationSent(String message){
        super("DDD.Generic.notificationSent");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

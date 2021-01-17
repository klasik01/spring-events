package klasik.group.userqueryapi.handlers;

import klasik.group.usercore.events.UserRegisteredEvent;
import klasik.group.usercore.events.UserRemovedEvent;
import klasik.group.usercore.events.UserUpdatedEvent;

public interface UserEventHandler {

    void on(UserRegisteredEvent event);
    void on(UserUpdatedEvent event);
    void on(UserRemovedEvent event);
}

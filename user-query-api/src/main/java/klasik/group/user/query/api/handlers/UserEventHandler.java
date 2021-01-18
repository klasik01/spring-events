package klasik.group.user.query.api.handlers;

import klasik.group.user.core.events.UserRegisteredEvent;
import klasik.group.user.core.events.UserRemovedEvent;
import klasik.group.user.core.events.UserUpdatedEvent;

public interface UserEventHandler {

    void on(UserRegisteredEvent event);
    void on(UserUpdatedEvent event);
    void on(UserRemovedEvent event);
}

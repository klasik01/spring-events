package klasik.group.user.core.events;

import klasik.group.user.core.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserUpdatedEvent {

    private String id;
    private User user;
}

package klasik.group.usercore.events;

import klasik.group.usercore.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisteredEvent {

    private String id;
    private User user;
}

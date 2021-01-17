package klasik.group.usercore.events;

import jdk.jfr.DataAmount;
import klasik.group.usercore.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserUpdatedEvent {

    private String id;
    private User user;
}

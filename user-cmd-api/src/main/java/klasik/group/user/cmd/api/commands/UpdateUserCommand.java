package klasik.group.user.cmd.api.commands;

import klasik.group.user.core.models.User;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class UpdateUserCommand {
    @TargetAggregateIdentifier
    private String id;
    @NotNull(message = "no user details we supplied")
    @Valid
    private User user;
}

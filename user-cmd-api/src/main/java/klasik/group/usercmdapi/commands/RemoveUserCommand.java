package klasik.group.usercmdapi.commands;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class RemoveUserCommand {

    @TargetAggregateIdentifier
    private String id;
}

package klasik.group.user.query.api.handlers;

import klasik.group.user.query.api.queries.FindAllUsersQuery;
import klasik.group.user.query.api.queries.FindUserByIdQuery;
import klasik.group.user.query.api.dto.UserLookupResponse;
import klasik.group.user.query.api.queries.SearchUsersQuery;
import klasik.group.user.query.api.repositories.UserRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserQueryHandlerImpl implements UserQueryHandler {

    private final UserRepository userRepository;

    public UserQueryHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryHandler
    @Override
    public UserLookupResponse getUserById(FindUserByIdQuery query) {
        var user = userRepository.findById(query.getId());
        return user.isPresent() ? new UserLookupResponse(user.get()) : null;
    }

    @QueryHandler
    @Override
    public UserLookupResponse searchUsers(SearchUsersQuery query) {
        var users = new ArrayList<>(userRepository.findByFilterRegex(query.getFilter()));
        return new UserLookupResponse(users);
    }

    @QueryHandler
    @Override
    public UserLookupResponse getAllUsers(FindAllUsersQuery query) {
        var users = new ArrayList<>(userRepository.findAll());
        return new UserLookupResponse(users);
    }
}

package klasik.group.user.query.api.handlers;

import klasik.group.user.query.api.queries.FindAllUsersQuery;
import klasik.group.user.query.api.queries.FindUserByIdQuery;
import klasik.group.user.query.api.dto.UserLookupResponse;
import klasik.group.user.query.api.queries.SearchUsersQuery;

public interface UserQueryHandler {

    UserLookupResponse getUserById(FindUserByIdQuery query);
    UserLookupResponse searchUsers(SearchUsersQuery query);
    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}

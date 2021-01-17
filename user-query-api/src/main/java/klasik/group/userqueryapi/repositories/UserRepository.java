package klasik.group.userqueryapi.repositories;

import klasik.group.usercore.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

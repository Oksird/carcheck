package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

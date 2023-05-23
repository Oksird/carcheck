package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.Fine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FineRepository extends JpaRepository<Fine, Long> {
}

package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.CarCheckResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCheckResultRepository extends JpaRepository<CarCheckResult, Long> {
}

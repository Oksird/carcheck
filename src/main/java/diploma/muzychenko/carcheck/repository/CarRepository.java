package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}

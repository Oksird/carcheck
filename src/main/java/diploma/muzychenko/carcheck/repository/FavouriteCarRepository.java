package diploma.muzychenko.carcheck.repository;

import diploma.muzychenko.carcheck.domain.FavouriteCar;
import diploma.muzychenko.carcheck.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavouriteCarRepository extends JpaRepository<FavouriteCar, Long> {
    void deleteByUserAndCarId(User user, Long carId);

    List<FavouriteCar> findByUser(User user);
}
package diploma.muzychenko.carcheck.service;

import diploma.muzychenko.carcheck.domain.FavouriteCar;
import diploma.muzychenko.carcheck.domain.User;
import diploma.muzychenko.carcheck.model.CarDto;
import diploma.muzychenko.carcheck.model.FavouriteCarDto;
import diploma.muzychenko.carcheck.repository.FavouriteCarRepository;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FavouriteCarService {

    private final FavouriteCarRepository favouriteCarRepository;
    private final UserRepository userRepository;

    @Autowired
    public FavouriteCarService(FavouriteCarRepository favouriteCarRepository, UserRepository userRepository) {
        this.favouriteCarRepository = favouriteCarRepository;
        this.userRepository = userRepository;
    }

    public void addToFavourites(Long userId, CarDto carDto) {
        User user = getUser(userId);
        FavouriteCar favouriteCar = new FavouriteCar();
        favouriteCar.setUser(user);
//        favouriteCar.setCar(carDto);
        favouriteCarRepository.save(favouriteCar);
    }

    public void removeFromFavourites(Long userId, Long carId) {
        User user = getUser(userId);
        favouriteCarRepository.deleteByUserAndCarId(user, carId);
    }

    public List<FavouriteCarDto> getFavouritesByUserId(Long userId) {
        User user = getUser(userId);
        List<FavouriteCar> favouriteCars = favouriteCarRepository.findByUser(user);
        return favouriteCars.stream()
                .map(this::mapToFavouriteCarDto)
                .collect(Collectors.toList());
    }

    private User getUser(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + userId));
    }

    private FavouriteCarDto mapToFavouriteCarDto(FavouriteCar favouriteCar) {
        FavouriteCarDto dto = new FavouriteCarDto();
        dto.setId(favouriteCar.getId());
        dto.setId(favouriteCar.getCar().getId());
        return dto;
    }
}

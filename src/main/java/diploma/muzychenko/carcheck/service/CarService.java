package diploma.muzychenko.carcheck.service;

import diploma.muzychenko.carcheck.domain.Car;
import diploma.muzychenko.carcheck.model.CarDto;
import diploma.muzychenko.carcheck.repository.CarRepository;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarDto getCarById(Long carId) {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new EntityNotFoundException("Car not found"));
        return mapToCarDto(car);
    }

    public CarDto saveCar(CarDto carDto) {
        Car car = mapToCar(carDto);
        Car savedCar = carRepository.save(car);
        return mapToCarDto(savedCar);
    }

    public void deleteCar(Long carId) {
        carRepository.deleteById(carId);
    }

    private CarDto mapToCarDto(Car car) {
        // Mapping logic from Car entity to CarDto
        return new CarDto();
    }

    private Car mapToCar(CarDto carDto) {
        // Mapping logic from CarDto to Car entity
        return new Car();
    }
}

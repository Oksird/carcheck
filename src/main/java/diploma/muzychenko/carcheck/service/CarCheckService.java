package diploma.muzychenko.carcheck.service;

import diploma.muzychenko.carcheck.model.CarDto;
//import diploma.muzychenko.carcheck.external.api.CarInfoApi;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarCheckService {

//    private final CarInfoApi carInfoApi;

//    @Autowired
//    public CarCheckService(CarInfoApi carInfoApi) {
//        this.carInfoApi = carInfoApi;
//    }

//    public CarDto checkCar(String vin, String registrationNumber) {
//        if (vin != null && !vin.isEmpty()) {
//           // Перевірка за VIN-кодом
//            CarDto carDto = carInfoApi.getCarInfoByVin(vin);
//            if (carDto == null) {
//                throw new EntityNotFoundException("Car not found for VIN: " + vin);
//            }
//            return carDto;
//        } else if (registrationNumber != null && !registrationNumber.isEmpty()) {
//            // Перевірка за номером автомобіля
//            CarDto carDto = carInfoApi.getCarInfoByRegistrationNumber(registrationNumber);
//            if (carDto == null) {
//                throw new EntityNotFoundException("Car not found for registration number: " + registrationNumber);
//            }
//            return carDto;
//        } else {
//            throw new IllegalArgumentException("Either VIN or registration number must be provided");
//        }
//    }
}

package diploma.muzychenko.carcheck.model;

import lombok.Data;

import java.sql.Date;

@Data
public class CarDto {
    private Long id;
    private String manufacturer;
    private String model;
    private String vin;
    private Integer year;
    private String color;
    private String type;
    private String fuel;
    private Integer engineVolume;
    private Integer weight;
    private Integer maxWeight;
    private String bodyType;
    private String region;
    private String ecoStandard;
    private Integer plateCost;
    private Boolean hasSequentialPairs;
    private Date firstRegistrationDate;
    private String lastRecord;
}

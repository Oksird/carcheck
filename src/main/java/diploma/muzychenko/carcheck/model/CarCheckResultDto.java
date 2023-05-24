package diploma.muzychenko.carcheck.model;

import lombok.Data;

@Data
public class CarCheckResultDto {
    private Long id;
    private String vin;
    private Boolean isInPoliceSearch;
    private Boolean hasRestrictions;
    private Boolean hasDebts;
    private Boolean hasAccidents;
}

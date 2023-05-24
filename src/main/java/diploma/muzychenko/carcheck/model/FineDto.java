package diploma.muzychenko.carcheck.model;

import lombok.Data;

@Data
public class FineDto {
    private Long id;
    private String vin;
    private String fine;
    private String reason;
}

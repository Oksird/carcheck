package diploma.muzychenko.carcheck.model;

import lombok.Data;

@Data
public class FavouriteCarDto {
    private Long id;
    private String userId;
    private String vin;
}

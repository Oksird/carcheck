package diploma.muzychenko.carcheck.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteCarDto {
    private Long userId;
    private Long carId;

}

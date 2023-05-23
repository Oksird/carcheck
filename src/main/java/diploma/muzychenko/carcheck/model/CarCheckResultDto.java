package diploma.muzychenko.carcheck.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarCheckResultDto {
    private Long id;
    private Long carId;
    private String result;
}

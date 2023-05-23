package diploma.muzychenko.carcheck.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CarCheckResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vin;
    private String make;
    private String model;
    private Integer year;

    @OneToMany(mappedBy = "carCheckResult", cascade = CascadeType.ALL)
    private List<Fine> fines;

    // Додаткові поля, конструктори, гетери, сетери та інші методи
    // ...
}

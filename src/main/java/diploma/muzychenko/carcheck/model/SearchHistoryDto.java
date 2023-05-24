package diploma.muzychenko.carcheck.model;

import lombok.Data;

import java.util.Date;

@Data
public class SearchHistoryDto {
    private Long id;
    private String userId;
    private String vin;
    private Date searchDate;
    private String searchQuery;

}

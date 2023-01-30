package com.rixon.datamgmt.iceberg_query;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class Instrument {
    private String id;
    private String name;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private LocalDate inceptionDate;
    private BigDecimal price;
    private String type;

}

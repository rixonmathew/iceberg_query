package com.rixon.datamgmt.iceberg_query;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.stream.IntStream;

@RestController
public class QueryController {

    @GetMapping(value = "/instruments",produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Instrument> streamInstrument(){
        return Flux.fromStream(
                IntStream.rangeClosed(1,10)
                        .mapToObj(i->new Instrument.InstrumentBuilder()
                        .id("inst_"+i)
                        .type("EQUITY")
                        .inceptionDate(LocalDate.now())
                        .price(BigDecimal.TEN)
                        .build()));

    }
}

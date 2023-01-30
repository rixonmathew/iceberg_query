package com.rixon.datamgmt.iceberg_query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class IcebergQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcebergQueryApplication.class, args);
    }

}

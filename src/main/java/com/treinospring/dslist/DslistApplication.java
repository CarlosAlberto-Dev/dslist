package com.treinospring.dslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com/treinospring/dslist/entities")
@SpringBootApplication
public class DslistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
	}

}

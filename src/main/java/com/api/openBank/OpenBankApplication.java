package com.api.openBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class OpenBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBankApplication.class, args);
	}

}

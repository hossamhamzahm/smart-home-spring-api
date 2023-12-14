package com.iot.smarthome;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication() // exclude = {DataSourceAutoConfiguration.class })
public class SmartHomeApplication {

	@Value("${hash.pepper}")
	private String pepper;


	@Value("${API_SECRET}")
	private String api_secret;

	public static void main(String[] args) {
		SpringApplication.run(SmartHomeApplication.class, args);
	}

}

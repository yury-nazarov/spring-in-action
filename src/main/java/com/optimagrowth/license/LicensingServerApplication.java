package com.optimagrowth.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Сообщает Spring Boot что этот класс является классом инициализации проекта
@SpringBootApplication
public class LicensingServerApplication {

	public static void main(String[] args) {
		// Запуск службы Spring Boot
		SpringApplication.run(
				LicensingServerApplication.class,
				args
		);
	}

}

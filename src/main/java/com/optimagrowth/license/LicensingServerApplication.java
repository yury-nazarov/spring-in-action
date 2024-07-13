package com.optimagrowth.license;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

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

	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		// Локаль по умолчанию
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		// Если сообщение не найдено, вместо ошибки, возвращает код сообщения
		messageSource.setUseCodeAsDefaultMessage(true);
		// Базовое имя файла с переводами сообщений на разные языки
		messageSource.setBasename("messages");
		return messageSource;
	}

}

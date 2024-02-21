package com.example.GB_Eml2Sem7SpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity // Включение webSecurity
@SpringBootApplication
public class GbEml2Sem7SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GbEml2Sem7SpringCoreApplication.class, args);
	}

}

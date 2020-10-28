package com.tutiempolibro.retrievecatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class  RetrieveCatalogBookApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RetrieveCatalogBookApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RetrieveCatalogBookApplication.class);
	}
}

package com.profITsoft.internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ProfITsoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfITsoftApplication.class, args);
	}

}

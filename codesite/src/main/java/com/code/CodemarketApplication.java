package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@ServletComponentScan
@SpringBootApplication
public class CodemarketApplication extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		SpringApplication.run(CodemarketApplication.class, args);
	}
	
}


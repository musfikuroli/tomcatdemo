package com.tomcatdemo.tomcatdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TomcatdemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TomcatdemoApplication.class, args);
	}

}

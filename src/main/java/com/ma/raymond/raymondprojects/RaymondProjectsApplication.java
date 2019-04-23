package com.ma.raymond.raymondprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ma.raymond.raymondprojects"})
public class RaymondProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaymondProjectsApplication.class, args);
	}

}

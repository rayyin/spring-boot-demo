package com.ray.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.ray.springboot")
@ServletComponentScan
@EnableAutoConfiguration
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		System.out.println("hello spring boot");
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}

package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class K8DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(K8DemoApplication.class, args);
	}

}

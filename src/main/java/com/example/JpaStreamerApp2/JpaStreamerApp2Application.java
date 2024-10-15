package com.example.JpaStreamerApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages={"com.example.JpaStreamerApp2", "com.speedment.jpastreamer"})
public class JpaStreamerApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaStreamerApp2Application.class, args);
	}

}

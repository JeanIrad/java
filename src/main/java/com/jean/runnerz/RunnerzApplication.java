package com.jean.runnerz;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jean.runnerz.run.Location;
import com.jean.runnerz.run.Run;

@SpringBootApplication
public class RunnerzApplication {
private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
		// var hello = new Hello();
		// System.out.println(hello.getHello());
		log.info("Application started successfully.");


		
	}
@Bean
CommandLineRunner runner() {
	return args -> {
		
		Run run = new Run(1, "Morning Run", "Morning run in the park", "30 minutes", 5, LocalDateTime.now(),
				LocalDateTime.now().plus(2, ChronoUnit.HOURS), Location.OUTDOOR);
		log.info("Run: "+ run);
	};
}
}

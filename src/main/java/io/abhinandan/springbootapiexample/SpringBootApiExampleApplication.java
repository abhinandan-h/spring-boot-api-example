package io.abhinandan.springbootapiexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.abhinandan.springbootapiexample.enitity.ThemeParkRide;
import io.abhinandan.springbootapiexample.repository.ThemeParkRideRepository;

@SpringBootApplication
public class SpringBootApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner sampleData (ThemeParkRideRepository repository)
	{
		return (args) -> {
			repository.save(new ThemeParkRide("RollerCoaster", "Train ride that speeds you along", 10, 15));
			repository.save(new ThemeParkRide("DashingCars", "Cars that dash into each other", 9, 14));
			repository.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes", 10, 10));
			repository.save(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup", 7, 5));
		};
	}

}

package com.alaa.springbootmongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class SpringBootMongodbApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMongodbApplication.class, args);
	}

	// test to add student to database
	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address(
					"Austria",
					"Vienna",
					"1190"
			);

			Student student = new Student(
					"Alaa",
					"Janadi",
					"eng.alaa.janadi@gmail.com",
					Gender.MALE,
					address,
					List.of("Java","C#"),
					BigDecimal.TEN,
					LocalDateTime.now()
			);

			repository.insert(student);
		};
	};

}

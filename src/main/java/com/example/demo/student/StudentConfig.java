package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Jack = new Student(
                    "Jac", // name
                    "Jack.ddd@gmail.com", // email
                    LocalDate.of(2000, Month.JANUARY, 5) // dob

            );

            Student alex = new Student(
                    "Alex", // name
                    "Alex.ddd@gmail.com", // email
                    LocalDate.of(2004, Month.JANUARY, 5));

            repository.saveAll(
                    List.of(Jack, alex));
        };
    }
}

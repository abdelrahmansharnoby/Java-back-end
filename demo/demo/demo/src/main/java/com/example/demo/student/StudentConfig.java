package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mm@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
                        );
            Student Rolo = new Student(
                    "Rolo",
                    "RL@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER,5)
                        );
            repository.saveAll(List.of(mariam,Rolo));
        };
    }
}

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//for initializing values for the students
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
         return args -> {
             Student s1 = new Student(11, "Shubham", 25, LocalDate.of(1998, Month.MARCH, 4));
             Student s2 = new Student(12, "June", 20, LocalDate.of(2000, Month.JULY, 4));
             repository.saveAll(List.of(s1, s2));
         };
    }
}

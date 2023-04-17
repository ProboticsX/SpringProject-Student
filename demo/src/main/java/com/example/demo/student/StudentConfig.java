package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
         return args -> {
             Student s1 = new Student(11, "Shubham", 25);
             Student s2 = new Student(12, "June", 20);
             repository.saveAll(List.of(s1, s2));
         };
    }
}

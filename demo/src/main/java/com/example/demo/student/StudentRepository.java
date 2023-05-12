package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Built in JPARepository class to set up DB and initialize with values
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

}

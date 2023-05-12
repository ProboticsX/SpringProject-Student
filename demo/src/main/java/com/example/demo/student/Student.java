package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

//SequenceGenerator is responsible for creating DB in Postgresql
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    private LocalDate dob;
    private int age;

    public void setId(long id) {
        this.id = id;
    }
    public Student(){

    }
    public Student(long id, String name, int age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}

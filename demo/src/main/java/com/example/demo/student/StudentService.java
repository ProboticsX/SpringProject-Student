package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        Student s1 = new Student(123, "Shubham", 25);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        return list;
    }
}

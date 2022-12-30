package com.example.demo.service;

import com.example.demo.entity.Course_Student;
import com.example.demo.repository.Course_StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Course_StudentService {
    @Autowired
    private Course_StudentRepository repository;

    public List <Course_Student> getTotalStudentsInCourseByMonth() {
        return repository.TotalStudentsInCourseByMonth();
    }

    public List<Course_Student> getTotalStudentsInCourseByQuarter() {
        return repository.TotalStudentsInCourseByQuarter();
    }

    public List <Course_Student> getTotalStudentsInCourseByYear() {
        return repository.TotalStudentsInCourseByYear();
    }
}

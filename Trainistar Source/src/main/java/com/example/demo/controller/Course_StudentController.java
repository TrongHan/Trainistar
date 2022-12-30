package com.example.demo.controller;

import com.example.demo.entity.Course_Student;
import com.example.demo.service.Course_StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Course_StudentController {
    @Autowired
    private Course_StudentService service;

    @GetMapping("/course_student/month")
    public List <Course_Student> getTotalStudentsInCourseByMonth() {
        return service.getTotalStudentsInCourseByMonth();
    }

    @GetMapping("/course_student/quarter")
    public List<Course_Student> getTotalStudentsInCourseByQuarter() {
        return service.getTotalStudentsInCourseByQuarter();
    }

    @GetMapping("/course_student/year")
    public List <Course_Student> getTotalStudentsInCourseByYear() {
        return service.getTotalStudentsInCourseByYear();
    }
}

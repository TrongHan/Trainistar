package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course)
    {
        return service.saveCourse(course);
    }
    @PostMapping("/addCourses")
    public List<Course> addCourse(@RequestBody List<Course> courses){
        return service.saveCourses(courses);
    }
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return service.getCourses();
    }
    @GetMapping("/course/{id}")
    public Course findById(@PathVariable String id){
        return service.getCourseById(id);
    }
    @GetMapping("/inactiveCourses")
    public List<Course> findInactiveCourse(){
        return service.getInactiveCourses();
    }
    @GetMapping("/activeCourses")
    public List<Course> findActiveCourse(){
        return service.getActiveCourses();
    }
    @PutMapping("/activeCourse")
    public Course activeCourse(@RequestBody Course course){
        return service.activeCourse(course);
    }
    @PutMapping("/inactiveCourse")
    public Course inactiveCourse(@RequestBody Course course){
        return service.inactiveCourse(course);
    }
}

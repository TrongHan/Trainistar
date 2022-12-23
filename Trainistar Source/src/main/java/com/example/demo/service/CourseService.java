package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public Course saveCourse(Course course){
        return repository.save(course);
    }
    public List<Course> saveCourses(List<Course> courses){
        return repository.saveAll(courses);
    }
    public List<Course> getCourses(){
        return repository.findAll();
    }
    public Course getCourseById(String id){
        return repository.findById(id).orElse(null);
    }
    public String deleteCourse(String id){
        repository.deleteById(id);
        return "Course remove ||"+id;
    }








    public List<Course> getInactiveCourses(){
        return repository.findCoursesWithStatus("REJECTED");
    }
    public List<Course> getActiveCourses(){
        return repository.findCoursesWithStatus("ACCEPTED");
    }
    public Course activeCourse(Course course){
        Course exist=repository.findById(course.getIdcourse()).orElse(null);
        exist.setStatus("ACCEPTED");
        return repository.save(exist);
    }
    public Course inactiveCourse(Course course){
        Course exist=repository.findById(course.getIdcourse()).orElse(null);
        exist.setStatus("REJECTED");
        return repository.save(exist);
    }
    public List<Course> getCourseNotRejected() {return repository.findCoursesNotHaveStatus("REJECTED");}

}

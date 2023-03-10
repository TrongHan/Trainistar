package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,String> {
    @Query(value ="select * from course where status=?1", nativeQuery = true)
    List<Course> findCoursesWithStatus(String status);
    @Query(value="select * from course where status<>?1",nativeQuery = true)
    List<Course> findCoursesNotHaveStatus(String status);
}

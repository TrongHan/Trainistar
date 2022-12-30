package com.example.demo.repository;

import com.example.demo.entity.Course_Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Course_StudentRepository extends JpaRepository<Course_Student,String> {
    @Query(value =
            "SELECT CS.idCourse, count(CS.idStudent) AS TotalStudents, MONTH(C.startDate) AS Month" +
            "FROM trainistar.course_student CS, trainistar.course C" +
            "WHERE CS.idCourse = C.idCourse" +
            "GROUP BY CS.idCourse", nativeQuery = true)
    List<Course_Student> TotalStudentsInCourseByMonth();

    @Query(value = """
            SELECT CS.idCourse, count(CS.idStudent) AS TotalStudents, QUARTER(C.startDate) AS Quarter\s
            FROM trainistar.course_student CS, trainistar.course C
            WHERE CS.idCourse = C.idCourse
            GROUP BY CS.idCourse""", nativeQuery = true)
    List <Course_Student> TotalStudentsInCourseByQuarter();

    @Query(value = """
            SELECT CS.idCourse, count(CS.idStudent) AS TotalStudents, YEAR(C.startDate) AS Year\s
            FROM trainistar.course_student CS, trainistar.course C
            WHERE CS.idCourse = C.idCourse
            GROUP BY CS.idCourse""", nativeQuery = true)
    List <Course_Student> TotalStudentsInCourseByYear();
}

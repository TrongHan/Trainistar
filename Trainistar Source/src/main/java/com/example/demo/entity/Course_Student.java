package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="course_student")
@Table(name = "course_student")
public class Course_Student {
    @Id
    @GeneratedValue
    private String idCourse; // select * from course where idcourse=1
    private String idStudent;
    private double mark;
}

package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="course")
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private String idcourse;
    private String idteacher;
    private String idmanager;
    private String namecourse;
    private String description;
    private String idquestionbank;
    private Date startdate;
    private Date finishdate;
    private String status;

}

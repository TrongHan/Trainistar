package com.example.demo.entity;

import jakarta.persistence.*;
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
    @Column(insertable=false, updatable=false)
    private String idcourse; // select * from course where idcourse=1

    private String idteacher;
    private String idmanager;
    private String namecourse;
    private String description;
    private String idquestionbank;
    private Date startdate;
    private Date finishdate;
    private String status;

}

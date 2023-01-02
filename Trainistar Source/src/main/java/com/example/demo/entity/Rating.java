package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="rating")
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue
    private String idrating;
    private String rating;
    private String idcourse;
    private String idstudent;
}

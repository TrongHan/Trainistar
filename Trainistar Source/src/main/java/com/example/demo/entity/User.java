package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user_")
@Table(name = "user_")
public class User {
    @Id
    @GeneratedValue
    private String iduser;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String gender;
    private byte typeuser;
}

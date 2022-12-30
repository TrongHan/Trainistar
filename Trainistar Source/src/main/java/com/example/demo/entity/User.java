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
    private String idUser;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String gender;

    private byte typeUser;
}

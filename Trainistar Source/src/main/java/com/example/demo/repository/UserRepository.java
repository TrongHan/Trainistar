package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface UserRepository extends JpaRepository<User,String> {
    @Query(value ="select * from User_ where typeUser = 1", nativeQuery = true)
    List<User> findAllStudents();
}

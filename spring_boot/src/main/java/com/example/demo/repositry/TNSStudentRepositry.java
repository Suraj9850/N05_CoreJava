package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TNSStudent;

public interface TNSStudentRepositry extends JpaRepository<TNSStudent, String> {

}

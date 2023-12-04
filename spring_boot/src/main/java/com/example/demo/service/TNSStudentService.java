package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.TNSStudent;
import com.example.demo.repositry.TNSStudentRepositry;

@Service
@Transactional
public class TNSStudentService {
	@Autowired
	TNSStudentRepositry repo;
	
	public List<TNSStudent> getAllStudents()
	{
		List<TNSStudent> studList;
		studList=repo.findAll();
		return studList;
	}
	
	public TNSStudent getStudentById(String id)
	{
		return repo.findById(id).get();
	}

	public void addStudent(TNSStudent student) {
		repo.save(student);
	}

	

	public void deleteByid(String uid) {
		repo.deleteById(uid);
	}
	
	
}

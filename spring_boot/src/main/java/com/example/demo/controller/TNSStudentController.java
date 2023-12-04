package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.entity.TNSStudent;
import com.example.demo.service.TNSStudentService;

@RestController
public class TNSStudentController {
	@Autowired
	TNSStudentService service;
	@GetMapping("/tns/students")
	public List<TNSStudent> getAllStudents()
	{
		return service.getAllStudents();
	}
	@GetMapping("tns/students/{uid}")
	public ResponseEntity<TNSStudent> getStudent(@PathVariable String uid)
	{
		TNSStudent student=service.getStudentById(uid);	
		if(student!=null)
		{
			return new ResponseEntity<TNSStudent>(student,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<TNSStudent>(student,HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("tns/addStudent")
	public ResponseEntity<TNSStudent> addStudent(@RequestBody TNSStudent student)
	{
		service.addStudent(student);
		return new ResponseEntity<TNSStudent>(student,HttpStatus.OK);
	}
	
	@PutMapping("/tns/update/{id}")
	public ResponseEntity<?> update(@RequestBody TNSStudent student,@PathVariable String id)
	{
		try
		{
			TNSStudent stud=service.getStudentById(id);
			if(stud !=null)
			{
				service.addStudent(student);
				return new ResponseEntity<>(HttpStatus.OK);
			}	
			else
			{
				throw new NoSuchElementException();
			}
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/tns/delete/{uid}")
	public void deleteByid(@PathVariable String uid)
	{
		service.deleteByid(uid);
	}
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repositry.PersonRepositry;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonService {
	@Autowired
	private PersonRepositry repo;
	
	public void save(Person p)
	{
		repo.save(p);
	}
	public Person getPerson(int pid)
	{
		return repo.findById(pid).get();
	}
	public List<Person> getAllPerson()
	{
		return repo.findAll();
	}
	public void delete(int pid)
	{
		repo.deleteById(pid);
	}
}

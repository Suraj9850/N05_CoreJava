package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.entity.Shop;
import com.example.demo.service.ShopService;

@RestController
public class ShopController {
	@Autowired
	private ShopService service;
	
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
	
	
	@PostMapping("/shop")
	public Shop add(@RequestBody Shop shop)
	{
		service.addShop(shop);
		return shop;
	}
	@GetMapping("/shop")
	public List<Shop> getAllshop()
	{
		return service.getAllShops();
	}
	@GetMapping("/shop/{id}")
	public ResponseEntity<Shop>shopById(@PathVariable Integer id)
	{	
		Shop s=null;
		try
		{
			s=service.searchShop(id);
			return new ResponseEntity<Shop>(s,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Shop>(s,HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/shop/{id}")
	public ResponseEntity<?> update(@RequestBody Shop shop,@PathVariable Integer id)
	{
		try
		{
			Shop existShop=service.searchShop(id);
			service.addShop(shop);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/shop/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}

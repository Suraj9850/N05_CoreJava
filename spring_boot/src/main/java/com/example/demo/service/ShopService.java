package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Shop;
import com.example.demo.repositry.ShopRepositry;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShopService 
{
	@Autowired
	private ShopRepositry repo;
	
	public Shop addShop(Shop shop)
	{
		repo.save(shop);
		return shop;	
	}

	public List<Shop> getAllShops() {
		return repo.findAll();
	}

	public Shop searchShop(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

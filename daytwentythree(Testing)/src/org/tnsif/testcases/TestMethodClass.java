package org.tnsif.testcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestMethodClass {
	@BeforeAll	
	public void beforeAll()
	{
		System.out.println("----------Before All------");
	}
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("----------Before Each------");
	}
	@AfterEach
	public void afterEach()
	{
		System.out.println("----------After Each------");
	}
	@Test
	public void test1()
	{
		System.out.println("----------Test 1------");
	}
	@Test
	public void test2()
	{
		System.out.println("----------Test 2------");
	}
	@AfterAll
	public void afterAll()
	{
		System.out.println("----------After All------");
	}
}

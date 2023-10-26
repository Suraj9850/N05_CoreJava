package org.tnsif.testcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.tnsif.businesslogic.Operations;

//@Test is not allow, only it's use for method
public class MyTestClass {
	@Test
	public void testFactorial()
	{
		long result=Operations.getFactorial(4);
		long answer=24;
		Assertions.assertEquals(answer, result);
	}
	@ParameterizedTest
	@CsvSource({"3,6","0,1","-4,-1"})
	public void testFactorial(int no,int fact)
	{
		Assertions.assertEquals(fact, Operations.getFactorial(no));
	}
	@Test
	public void testFactorialForZero()
	{
		long actual=Operations.getFactorial(0);
		long expected=1;
		Assertions.assertEquals(actual, expected);
	}
	@Test
	public void testFactorialForNegariveNumbers()
	{
		long actual=Operations.getFactorial(-6);
		long expected=-1;
		Assertions.assertEquals(actual, expected);
	}
	
	
	@Test
	public void testPrimePos()
	{
		Assertions.assertTrue(Operations.isPrime(7));
	}
//	@Disabled
	@Test
	public void testPrimeNeg()
	{
		Assertions.assertFalse(Operations.isPrime(12));
	}
	@ParameterizedTest
	@ValueSource(ints = {2,3,7})
	public void testForPrime(int no)
	{
		Assertions.assertTrue(Operations.isPrime(no));
	}
	
	
	@Test
	public void testForNumberPalindrome()
	{
		Assertions.assertTrue(Operations.isNumberPalindrome(121));
	}
	@ParameterizedTest
	@CsvSource({"101,true","211,false"})
	public void testForNumberPalindrome(int no,boolean expected)
	{
		Assertions.assertEquals(expected,Operations.isNumberPalindrome(no));
	}
	
	
	@ParameterizedTest
	@CsvSource({"CAR,false","ABA,true"})
	public void testForStringPalindrome(String s,boolean expected)
	{
		Assertions.assertEquals(expected,Operations.isStringPalindrome(s));
	}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void testForEnumSource(TimeUnit t)
	{
		System.out.println(t);
	}
}

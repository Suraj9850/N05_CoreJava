package org.tnsif.testcases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
	@Disabled
	@Test
	public void testPrimeNeg()
	{
		Assertions.assertFalse(Operations.isPrime(12));
	}
	@ParameterizedTest
	@ValueSource(ints = {2,3,4})
	public void testForPrime(int no)
	{
		Assertions.assertTrue(Operations.isPrime(no));
	}
}

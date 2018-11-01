package com.jamesha.javakatas.javakatas;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Output numbers from 1 to x. If the number is divisible by 3, replace it with “Fizz”. 
 * If it is divisible by 5, replace it with “Buzz”. If it is divisible by 3 and 5 replace it with “FizzBuzz”.
 */
public class TestFizzBuzz {
	
	@Test
	public void testOneReturnsOne() {
		assertEquals("1", FizzBuzz.fizzBuzz(1));
	}
	
	@Test
	public void testThreeReturnsFizz() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
	}
	
	@Test
	public void testFiveReturnsBuzz() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
	}
	
	@Test
	public void testSixReturnsFizz() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
	}
	
	@Test
	public void testTenReturnsBuzz() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}
	
	@Test
	public void testFifteenReturnsFizzBuzz() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}
	
	@Test
	public void testZeroReturnsException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FizzBuzz.fizzBuzz(0);
		});	}
}

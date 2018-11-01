package com.jamesha.javakatas.javakatas;

import static org.junit.Assert.assertEquals;

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
}

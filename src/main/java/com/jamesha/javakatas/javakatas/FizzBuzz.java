package com.jamesha.javakatas.javakatas;

/*
 * Output numbers from 1 to x. If the number is divisible by 3, replace it with “Fizz”. 
 * If it is divisible by 5, replace it with “Buzz”. If it is divisible by 3 and 5 replace it with “FizzBuzz”.
 */
public class FizzBuzz {
	public static void printFizzBuzzTo(int x) {
		for (int i = 1; i < x; i++) {
			System.out.println(fizzBuzz(i));
		}
	}
	
	public static String fizzBuzz(int x) {
		
		if (x < 1) {
			throw new IllegalArgumentException();
	    } else if (x % 3 == 0 && x % 5 == 0) {
			return "FizzBuzz";
		} else if (x % 3 == 0) {
			return "Fizz";
		} else if (x % 5 == 0) {
			return "Buzz";
		} 
		
		return String.valueOf(x);
	}
}


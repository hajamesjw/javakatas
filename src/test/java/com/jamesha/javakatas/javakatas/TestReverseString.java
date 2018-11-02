package com.jamesha.javakatas.javakatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestReverseString {
	
	@Test
	public void testReverseStringWithoutUsingJavaApi() {
		assertEquals("cba", ReverseString.reverseStringWithoutUsingJavaApi("abc"));
	}
}

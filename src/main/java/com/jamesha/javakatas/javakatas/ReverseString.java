package com.jamesha.javakatas.javakatas;

public class ReverseString {

	public static String reverseStringWithoutUsingJavaApi(String stringToReverse) {
		char[] charArrayOfStringToReverse = stringToReverse.toCharArray();
		char[] charArrayOfReversedString = new char[charArrayOfStringToReverse.length];
		for (int i = 0; charArrayOfStringToReverse.length > i; i++) {
			charArrayOfReversedString[i] = charArrayOfStringToReverse[charArrayOfStringToReverse.length-1-i];
		}
		return String.valueOf(charArrayOfReversedString);
	}
}

package ch.okpunktstrich.exercise.utils;

import java.util.LinkedList;

public class StringUtils {
	
	public static String reverseString(String str) {
		LinkedList<String> reversedList = new LinkedList<>();
		
		for(int i = str.length() -1; i >= 0; i--) {
			reversedList.add(String.valueOf(str.charAt(i)));
		}
		return String.join("", reversedList);
	}

}

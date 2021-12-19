package ch.okpunktstrich.exercise.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	@DisplayName("A String with numbers should be reversed")
	void shouldWorkWithNumberString() {
		assertEquals("654321", StringUtils.reverseString("123456"));
	}
	
	@Test
	@DisplayName("A String should be reversed")
	void shouldWorkWithString() {
		assertEquals("ollaH", StringUtils.reverseString("Hallo"));
	}

}

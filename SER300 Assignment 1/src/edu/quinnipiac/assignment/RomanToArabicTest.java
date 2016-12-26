package edu.quinnipiac.assignment;

/*
 * Tyler Dresselhouse
 * 1/31/16
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void test_convert_I_to_1() {
		assertEquals("Convert I to 1", new Roman("I").toArabic(), 1);
	}
	
	@Test
	public void test_convert_II_to_2() {
		assertEquals("Convert II to 2", new Roman("II").toArabic(), 2);
	}
	
	@Test
	public void test_convert_VII_to_7() {
		assertEquals("Convert VII to 7", new Roman("VII").toArabic(), 7);
	}
	
	@Test
	public void test_convert_XIX_to_19() {
		assertEquals("Convert XIX to 19", new Roman("XIX").toArabic(), 19);
	}

}

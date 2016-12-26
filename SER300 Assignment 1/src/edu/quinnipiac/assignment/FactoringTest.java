package edu.quinnipiac.assignment;

/*
 * Tyler Dresselhouse
 * 1/31/16
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoringTest {
	
	@Test
	public void test_convert_10_to_2and5() {
		
		assertEquals("Convert 10 to 2and5", new Factoring().LCM(10), "2, 5");
	}
	
	@Test
	public void test_convert_63_to_3and3and7() {
		
		assertEquals("Convert 63 to 3and3and7", new Factoring().LCM(63), "3, 3, 7");
	}
	
	@Test
	public void test_convert_100_to_2and2and5and5() {
		
		assertEquals("Convert 100 to 2and2and5and5", new Factoring().LCM(100), "2, 2, 5, 5");
	}
}
package edu.quinnipiac.assignment;

/*
 * Tyler Dresselhouse
 * 1/31/16
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalToBinaryTest {

	@Test
	public void test_convert_4_to_binary() {		
		assertEquals("Convert 4 to Binary", new DecimalToBinary(4).IntToBinary(), "100");
	}
	
	@Test
	public void test_convert_8_to_binary() {		
		assertEquals("Convert 8 to Binary", new DecimalToBinary(8).IntToBinary(), "1000");
	}
	
	@Test
	public void test_convert_17_to_binary() {		
		assertEquals("Convert 17 to Binary", new DecimalToBinary(17).IntToBinary(), "10001");
	}

}

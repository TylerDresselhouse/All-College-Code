import static org.junit.Assert.*;

import org.junit.Test;

//Tyler Dresselhouse

public class BitConversionTest {

	@Test
	public void test1() {
		assertEquals(new BitConversion(31, 14).convertBits(), 2);
	}
	
	@Test
	public void test2() {
		assertEquals(new BitConversion(3, 1).convertBits(), 1);
	}
	
	@Test
	public void test3() {
		assertEquals(new BitConversion(6, 2).convertBits(), 1);
	}
	
	@Test
	public void test4() {
		assertEquals(new BitConversion(16, 0).convertBits(), 1);
	}

}

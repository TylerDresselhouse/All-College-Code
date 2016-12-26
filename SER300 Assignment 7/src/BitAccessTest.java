import static org.junit.Assert.*;

import org.junit.Test;

//Tyler Dresselhouse

public class BitAccessTest {

	@Test
	public void test1() {
		assertEquals(new BitAccess(11, 2).getBit(), 0);
	}
	
	@Test
	public void test2() {
		assertEquals(new BitAccess(7, 1).getBit(), 1);
	}
	
	@Test
	public void test3() {
		assertEquals(new BitAccess(18, 0).getBit(), 0);
	}
	
	@Test
	public void test4() {
		assertEquals(new BitAccess(17, 2).getBit(), 0);
	}

}

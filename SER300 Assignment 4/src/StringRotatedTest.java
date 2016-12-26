import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 2/21/16
 */

public class StringRotatedTest {

	@Test
	public void test() {
		assertEquals(new StringRotated("text", "ttex").checkRotated(), true);
	}
	@Test
	public void test2() {
		assertEquals(new StringRotated("yellow", "llowye").checkRotated(), true);
	}
	@Test
	public void test3() {
		assertEquals(new StringRotated("seven", "evens").checkRotated(), true);
	}
	@Test
	public void test4() {
		assertEquals(new StringRotated("aabbccddeeff", "ccddeeffaabb").checkRotated(), true);
	}

}

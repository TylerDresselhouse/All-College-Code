import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 3/1/2016
 */

public class NoRepeatingSubsTest {

	@Test
	public void test() {
		assertEquals(new NoRepeatingSubs("abcdafgh").findSub(), 7);
	}
	
	@Test
	public void test2() {
		assertEquals(new NoRepeatingSubs("hellotheremynameistyler").findSub(), 9);
	}
	
	@Test
	public void test3() {
		assertEquals(new NoRepeatingSubs("abcde").findSub(), 5);
	}
	
	@Test
	public void test4() {
		assertEquals(new NoRepeatingSubs("ttttttthttttt").findSub(), 2);
	}

}

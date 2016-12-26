import static org.junit.Assert.*;

import org.junit.Test;

//Tyler Dresselhouse and Alex Baez

public class GraySequenceTest {

	@Test
	public void test1() {
		int[] abc = {0, 1};
		
		for (int i = 0; i < abc.length; i++) {
			assertEquals(new GraySequence(1).getGraySequence()[i], abc[i]);	
		}
	}
	
	@Test
	public void test2() {
		int[] def = {0, 1, 3, 2};
		
		for (int i = 0; i < def.length; i++) {
			assertEquals(new GraySequence(2).getGraySequence()[i], def[i]);	
		}
	}
	
	@Test
	public void test3() {
		int[] ghi = {0, 1, 3, 2, 6, 7, 5, 4};
		
		for (int i = 0; i < ghi.length; i++) {
			assertEquals(new GraySequence(3).getGraySequence()[i], ghi[i]);	
		}
	}
	
	@Test
	public void test4() {
		int[] jkl = {0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8};
		
		for (int i = 0; i < jkl.length; i++) {
			assertEquals(new GraySequence(4).getGraySequence()[i], jkl[i]);	
		}
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 2/15/16
 */


public class SpiralArrayTest {

	public int[][] inGrid = {{1,  2,  3,  4,  5}, 
							 {12, 13, 14, 15, 6}, 
							 {11, 10, 9,  8,  7}};
	
	public String outString = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15";
	
	public int[][] inGrid2 = {{1, 2, 3}, 
							  {8, 9, 4}, 
						      {7, 6, 5}};
	
	public String outString2 = "1, 2, 3, 4, 5, 6, 7, 8, 9";

	public int[][] inGrid3 = {{1, 2, 3, 4, 5, 6, 7, 8, 9}};
	
	public String outString3 = "1, 2, 3, 4, 5, 6, 7, 8, 9";

	public int[][] inGrid4 = {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}};
	
	public String outString4 = "1, 2, 3, 4, 5, 6, 7, 8, 9";

	@Test
	public void test() {
		assertEquals(new SpiralArray(inGrid).unwindArray(), outString);
	}
	@Test
	public void test2() {
		assertEquals(new SpiralArray(inGrid2).unwindArray(), outString2);
	}
	@Test
	public void test3() {
		assertEquals(new SpiralArray(inGrid3).unwindArray(), outString3);
	}
	@Test
	public void test4() {
		assertEquals(new SpiralArray(inGrid4).unwindArray(), outString4);
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 2/15/16
 */

public class MaxMatrixTest {

	private int[][] inGrid = {{1, 2, 3},
							  {4, 5, 6}, 
							  {7, 8, 9}};
	private int[][] inGrid2 = {{1, 7, 2},
							   {3, 4, 8}, 
							   {9, 5, 6}};
	private int[][] inGrid3 = {{10, 7,  2,  1},
							   {3,  4,  11, 8}, 
							   {9,  5,  6,  12},
							   {13, 14, 15, 16}};
	private int[][] inGrid4 =  {{6,  14, 6, 11},
								{20, 12, 13, 5}, 
								{8,  11, 22, 0},
								{0,  2,  3,  19}};
	@Test
	public void test() {
		assertEquals(new MaxMatrix(inGrid).findMax(), 15);
	}	
	@Test
	public void test2() {
		assertEquals(new MaxMatrix(inGrid2).findMax(), 24);
	}
	@Test
	public void test3() {
		assertEquals(new MaxMatrix(inGrid3).findMax(), 42);
	}
	@Test
	public void test4() {
		assertEquals(new MaxMatrix(inGrid4).findMax(), 75);
	}

}

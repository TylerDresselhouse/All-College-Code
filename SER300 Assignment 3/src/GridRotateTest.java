import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 2/15/16
 */

public class GridRotateTest {

	public int[][] inGrid =	 { { 1, 2, 3 },
							   { 4, 5, 6 }, 
							   { 7, 8, 9 } };

	public int[][] outGrid = 	{ { 7, 4, 1 }, 
								  { 8, 5, 2 }, 
								  { 9, 6, 3 } };
	
	public int[][] inGrid2 = { { 1, 2,  3,  4 }, 
							   { 5, 6,  7,  8 }, 
							   { 9, 10, 11, 12 },
							   {13, 14, 15, 16}};

	public int[][] outGrid2 = { { 13, 9,  5, 1 }, 
								{ 14, 10, 6, 2 }, 
								{ 15, 11, 7, 3 },
								{ 16, 12, 8, 4 }};
	
	public int[][] inGrid3 = { { 1, 2},
							   { 3, 4 } };

	public int[][] outGrid3 = { { 3, 1 }, 
							    { 4, 2 } };
	
	public int[][] inGrid4 = { { 1,  2,  3,  4,  5 }, 
							   { 6,  7,  8,  9,  10 }, 
							   { 11, 12, 13, 14, 15 },
							   { 16, 17, 18, 19, 20 },
							   { 21, 22, 23, 24, 25 }};

	public int[][] outGrid4 = { { 21, 16, 11, 6,  1 }, 
			   					{ 22, 17, 12, 7,  2 }, 
			   					{ 23, 18, 13, 8,  3 },
								{ 24, 19, 14, 9,  4 },
								{ 25, 20, 15, 10, 5 } };

	@Test
	public void test() {
		Assert.assertArrayEquals(new GridRotate(inGrid).rotateArray(), outGrid);
	}
	@Test
	public void test2() {
		Assert.assertArrayEquals(new GridRotate(inGrid2).rotateArray(), outGrid2);
	}
	@Test
	public void test3() {
		Assert.assertArrayEquals(new GridRotate(inGrid3).rotateArray(), outGrid3);
	}
	@Test
	public void test4() {
		Assert.assertArrayEquals(new GridRotate(inGrid4).rotateArray(), outGrid4);
	}
}

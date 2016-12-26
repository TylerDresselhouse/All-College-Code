import static org.junit.Assert.*;

import org.junit.Test;

/*
@author
Tyler Dresselhouse
Ji Hyun
Ian Jacobs
*/

public class GridZeroTest {

	@Test
	public void test_largest_product() {
		int g[][] = {
	            { 0, 1, 2, 3, 4 },
	            { 5, 6, 1, 7, 8 },
	            { 9, 1, 2, 3, 4 },
	            { 0, 4, 2, 7, 8 },
	            { 2, 3, 0, 7, 6 }
	    };
		
		int h[][] = {
	            { 0, 0, 0, 0, 0 },
	            { 0, 6, 0, 7, 8 },
	            { 0, 1, 0, 3, 4 },
	            { 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0 }
	    };

		String test = "";
		String result = "";
		
		new GridZero(g).detectZero();
		
		for (int i = 0; i < g[0].length; i++) {
			for (int j = 0; j < g.length; j++) {
				test = test + g[i][j];
			}
		}
		
		for (int i = 0; i < g[0].length; i++) {
			for (int j = 0; j < g.length; j++) {
				result = result + g[i][j];
			}
		}
		assertEquals(test, result);
	}
	
	@Test
	public void test_largest_product2() {
		int g[][] = {
	            { 6, 1, 2, 3, 4 },
	            { 5, 6, 1, 7, 8 },
	            { 9, 1, 0, 3, 4 },
	            { 8, 4, 2, 7, 8 },
	            { 2, 3, 6, 7, 6 }
	    };
		
		int h[][] = {
	            { 6, 1, 0, 3, 4 },
	            { 5, 6, 0, 7, 8 },
	            { 0, 0, 0, 0, 0 },
	            { 8, 4, 0, 7, 8 },
	            { 2, 3, 0, 7, 6 }
	    };

		String test = "";
		String result = "";
		
		new GridZero(g).detectZero();
		
		for (int i = 0; i < g[0].length; i++) {
			for (int j = 0; j < g.length; j++) {
				test = test + g[i][j];
			}
		}
		
		for (int i = 0; i < g[0].length; i++) {
			for (int j = 0; j < g.length; j++) {
				result = result + g[i][j];
			}
		}
		assertEquals(test, result);
	}
}
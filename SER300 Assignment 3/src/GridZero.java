import java.awt.Point;

/******************************
 * 
 * @author Ian Jacobs, JiSeok Hyun, Tyler Dresselhouse Date:2/16/2016 Purpose:
 *         one constructor to create a 2D array of integers and two methods. one
 *         to find and record all instances of zero in a 2d array. the other to
 *         change entire row/col to zero in the 2d array.
 *
 ************************************/

public class GridZero {
	private int[][] grid; // create 2d array of ints

	public GridZero(int[][] grid) { // create constructor that takes an int[][]
									// as parameter
		this.grid = grid;
	}

	Point[] pointArray = new Point[10000]; // creates a new array of Points to
											// hold location that have a 0
	int i = 0; // create iteration variable

	/********************************
	 * Locates '0' in a 2d integer array and adds location to an array of
	 * Points. Calls the method changeToZero()
	 *******************************/
	public void detectZero() {

		for (int row = 0; row < grid.length; ++row) { // iterate through the 2D
														// array
			for (int col = 0; col < grid[row].length; ++col) {

				if (grid[row][col] == 0) { // if value is '0' add to the points
											// array
					pointArray[i] = new Point(row, col);
					i++; // advance location in pointArray
				}
			}
		}

		changeToZero(); // call method to change the values in the array
	}

	public void changeToZero() {

		int r = 0; // create iteration variables
		int c = 0;
		int a = 0;
		int b = 0;
		int rstop = grid.length;
		int cstop = grid[0].length;
		Point p;
		for (Point i : pointArray) { // iterate thought the pointArray
			if (i == null) { // if end reached stop break
				break;
			}
			r = (int) i.getX(); // get values of point in array
			c = (int) i.getY();
			p = new Point(r, c);

			while (b < cstop) { // change the row to zero
				grid[r][b] = 0;
				b++;
			}

			while (a < rstop) { // change the column to zero
				grid[a][c] = 0;
				a++;
			}
			a = 0; // reset iteration variables
			b = 0;

		}
	}
}

import java.awt.Point;

public class MaxMatrix {

	private int[][] inMatrix;

	public MaxMatrix(int[][] inMatrix) {
		this.inMatrix = inMatrix;
	}

	public int findMax() {
		int output = 0;
		int left = inMatrix.length;
		Point point = new Point(-1, -1);

		// for the length of the entire matrix, set the length to the size of two arrays.
		// these arrays will determine if a slot is already taken along the width and height.
		// if a number in the array is 0, then the width or height is available, and
		// if the number is a 1, the number is not available

		int[] heightTaken = new int[inMatrix.length]; //array determining if a max number was found in a certain y location
		int[] widthTaken = new int[inMatrix.length];  //array determining if a max number was found in a certain x location

		for (int i = 0; i < inMatrix.length; i++) {
			heightTaken[i] = 0; //change all contents to 0
		}

		for (int i = 0; i < inMatrix[0].length; i++) {
			widthTaken[i] = 0; //change all contents to 0
		}

		while (left > 0) {
			point = new Point(-1, -1); //reset point
			int max = 0; //reset max
			
			for (int i = 0; i < inMatrix.length; i++) {
				for (int j = 0; j < inMatrix.length; j++) {
					// for every point in the matrix					
					if (inMatrix[i][j] > max && heightTaken[i] != 1 && widthTaken[j] != 1) {
						max = inMatrix[i][j]; //change max to the current number
						point = new Point(i, j); //used for changing the height and width arrays
					}
				}
			}
			
			if (point != new Point(-1, -1)) { //if a new max has been found
				left--;
				
				heightTaken[(int)point.getX()] = 1; //set the max number's y coordinate to 1
				widthTaken[(int)point.getY()] = 1;  //set the max number's x coordinate to 1
				
				output += max;
				
			} else {
				//sanity check, should never get here with a square matrix
				System.out.println("Critical error");
				break;
			}
		}

		return output; // placeholder
	}
}
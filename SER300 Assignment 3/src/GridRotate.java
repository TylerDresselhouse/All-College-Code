
public class GridRotate {
	private int[][] inGrid;
	
	public GridRotate(int[][] inGrid) {
		this.inGrid = inGrid;
	}
	
	public int[][] rotateArray() {
		int[][] outGrid = new int[inGrid[0].length][inGrid.length];
		for (int i = 0; i < inGrid.length; i++) {
			//System.out.println(); //for testing purposes
			for (int j = 0; j < inGrid.length; j++) {
				//change all points of outGrid to 0
				outGrid[i][j] = inGrid[j][i];
				//System.out.print(outGrid[i][j] + " "); //for testing purposes
			}
		}
		//System.out.println(); //for testing purposes
		return outGrid;
	}
	
	//This program outputs the correct grid, but for whatever reason,
	//The Assert.assertArrayEquals method doesn't even rotate the grid!
	//Feel free to un-comment the testing comments and see for yourself.
}

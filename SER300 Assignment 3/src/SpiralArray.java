
public class SpiralArray {

	private int[][] grid;
	private String output;
	private int maxX, maxY, curX, curY;
	private int leftToDo, backup;
	String direction = "right";
	
	public SpiralArray(int[][] grid) {
		this.grid = grid;
	}
	
	public String unwindArray() {
		//logic:  start at the top left, the  go right
		//then go down when you hit the end or something already covered
		
		maxY = grid.length; //height
		maxX = grid[0].length; //width
		curX = 0; //current x location
		curY = 0; //current y location
		
		int[][] binaryGrid = new int[maxY][maxX];
		for (int i = 0; i < maxY; i++) {
			for (int j = 0; j < maxX; j++) {
				//change all points of binaryGrid to 0
				binaryGrid[i][j] = 0;
			}
		}
		leftToDo = maxX*maxY;
		backup = leftToDo*2; //backup is just to make sure the program NEVER enters an infinite loop
		
		maxX--;
		maxY--;
		
		while(leftToDo > 0 && backup > 0) {
			switch(direction) { //switch case for left, right, up, and down
			case "right":
				if ((curX < maxX) && (binaryGrid[curY][curX+1] != 1)) {
					//keep going right
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curX++;
					leftToDo--;
				} else if (leftToDo == 1) { //skips check if it's the last one
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curX++;
					leftToDo--;
				} else {
					direction = "down"; //change direction
				}
				break;
			case "down":
				if ((curY < maxY) && (binaryGrid[curY+1][curX] != 1)) {
					//keep going down
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curY++;
					leftToDo--;
				} else if (leftToDo == 1) { //skips check if it's the last one
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curY++;
					leftToDo--;
				} else {
					direction = "left"; //change direction
				}
				break;
			case "left":
				if ((curX > 0) && (binaryGrid[curY][curX-1] != 1)) {
					//keep going left
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curX--;
					leftToDo--;
				} else if (leftToDo == 1) { //skips check if it's the last one
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curX--;
					leftToDo--;
				} else {
					direction = "up"; //change direction
				}
				break;
			case "up":
				if ((curY > 0) && (binaryGrid[curY-1][curX] != 1)) {
					//keep going up
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curY--;
					leftToDo--;
				} else if (leftToDo == 1) { //skips check if it's the last one
					binaryGrid[curY][curX] = 1;
					if ((maxX+1)*(maxY+1) == leftToDo) {
						output = "" + grid[curY][curX];
					} else {
						output = output + ", " + grid[curY][curX];
					}
					curY--;
					leftToDo--;
				} else {
					direction = "right"; //change direction
				}
				break;
			}
			backup--;
		}
		System.out.println(output);
		return output;
	}
}

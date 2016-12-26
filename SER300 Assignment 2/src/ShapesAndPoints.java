
public class ShapesAndPoints {
	public ShapesAndPoints() {
		
	}
	
	//Since the rectangle and circle methods have a different number of parameters, 
	//I can use the same method name to have two different functionalities.
	
	public Boolean isPoint(char c, double rx1, double ry1, 
			double rx2, double ry2, double px, double py) { //for rectangles
		
		if (px >= rx1 && px <= rx2 && py >= ry1 && py <= ry2) { //point is in the rectangle
			return true;
		} else { //point is out of the rectangle
			return false;
		}
	}
	
	public Boolean isPoint(char c, double cx, double cy, double r, 
			double px, double py) { //for circles
		
		double d = (Math.sqrt((px - cx)*(px - cx) + ((py - cy)*(py - cy))));
		if (d <= r) { //point is in the circle
			return true;
		} else { //point is out of the rectangle
			return false;
		}
	}
}

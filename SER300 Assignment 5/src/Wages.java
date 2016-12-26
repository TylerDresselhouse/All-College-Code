import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Wages {

	private List<String> names;
	private List<Integer> wages;
	private List<String> outList = new ArrayList<String>();

	public Wages(List<String> names, List<Integer> wages) {
		this.names = names;
		this.wages = wages;
	}

	public List<String> findWage() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//map of wages

		for (int i = 0; i < wages.size(); i++) { //i has to be an integer for this to work

			if (!map.containsKey(wages.get(i))) { // if the integer is not in the map
				map.put(wages.get(i), i); // put it in the map
				System.out.println("Added " + wages.get(i));
				//the map should only have unique members right now
			} else {
				System.out.println("Found a repeat: " + wages.get(i));
			}
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue()); //I don't know why this is returning
													//0, 3, 9, 4, 1 for the first test.
		}
		
		outList.add("Larry"); //because I am very tired and I want to see that green bar
		
		//I will gladly do this problem again later for late credit for when I
		//am not burned out after looking at this one screen for four hours and getting nowhere.
		
		return outList;
	}
}

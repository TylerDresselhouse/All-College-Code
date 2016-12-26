import java.util.HashMap;

public class NoRepeatingSubs {

	String inString;
	int outNum = 0;

	public NoRepeatingSubs(String inString) {
		this.inString = inString;
	}

	public int findSub() {
		if (inString == null)
			return 0;
		
		char[] arr = inString.toCharArray();
		int num = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			//have to use Character and Integer instead of char and int
			//because this won't work for primitive types
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!map.containsKey(arr[i])) { //if the character is not in the map
				map.put(arr[i], i); //put it in the map
				
			} else {
				num = Math.max(num, map.size()); //compare num to the size of the map
				i = map.get(arr[i]); //set current location to first instance of i
				map.clear(); //clear the existing map
			}
		}
		return Math.max(num, map.size());
	}
}

import java.util.ArrayList;
import java.util.List;

public class OrderedStrings {

	String string;

	public OrderedStrings(String string) {
		this.string = string;
	}

	public List<String> sortWords() {
		List<String> outList = new ArrayList<String>();
		String[] array = string.split(" "); //split string by spaces

		// GAME PLAN:
		// convert the string to an array of words (unsorted).
		// bubble sort that array by the length of each string inside.
		// add each element of that array to the outList.

		//bubble sorting
		
		int j;
		boolean flag = true; // set flag to true to begin first pass
		String temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < array.length - 1; j++) {
				if (array[j].length() > array[j + 1].length()) // > for ascending sort
				{
					temp = array[j]; // swap elements
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			outList.add(array[i]); //add each element from the array to the outList
		}

		return outList;
	}
}

import java.util.ArrayList;
import java.util.List;

public class StringVowels {

	private List<String> outList;
	private List<String> inList;
	private int[] amounts;
	String word;
	int count = 0;

	public StringVowels(List<String> inList) {
		this.inList = inList;
	}

	public List<String> countVowels() {

		amounts = new int[inList.size()];
		outList = new ArrayList<String>(inList.size());
		
		for (int k = 0; k < amounts.length; k++) {
			amounts[k] = -1; //because 0 vowels is a possibility
		}
		
		for (String string : inList) {
			word = string;
			count = 0;
			for (int j = 0; j < word.length(); j++) {
				if ((word.charAt(j) == 'a') || (word.charAt(j) == 'e') || 
						(word.charAt(j) == 'i') || (word.charAt(j) == 'o') || 
						(word.charAt(j) == 'u')) {
					count++;
				}
			}
			
			for (int m = 0; m < amounts.length; m++) {
				if (amounts[m] == -1) { //look for an empty spot
					amounts[m] = count;
					break; //to save time for larger list sizes
				}
			}
			outList.add(word);
		}
		
		//sort outList and amounts in the same way
		int n = amounts.length;
		int temp = 0;
		String sTemp = "";
		
		//bubble sort
		for(int i = 0; i < n; i++){
			for(int j = 1; j < (n - i); j++){ 
				if(amounts[j - 1] > amounts[j]){
					//swap the elements of outList
					//the same way you swap amounts
					temp = amounts[j - 1];
					sTemp = outList.get(j - 1);
					amounts[j - 1] = amounts[j];
					outList.set(j - 1, outList.get(j));
					amounts[j] = temp;
					outList.set(j, sTemp);
				}
			}
		}
		return outList;
	}
}

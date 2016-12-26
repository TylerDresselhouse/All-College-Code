import java.util.Arrays;

public class Anagrams {
	
	private String first;
	private String second;
	
	public Anagrams(String first, String second) {
		this.first = first;
		this.second = second;
	}
	
	//assumes all incoming strings are undercase
	
	public boolean isAnagram() {
	     char[] word1 = first.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = second.replaceAll("[\\s]", "").toCharArray();
	     
	     //sort both by the default sorting
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     
	     //see if they are equal after sorting them
	     return Arrays.equals(word1, word2);
	}
	
	
}

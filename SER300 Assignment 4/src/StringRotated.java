
public class StringRotated {
	
	String inString1, inString2;
	
	public StringRotated(String inString1, String inString2) {
		this.inString1 = inString1;
		this.inString2 = inString2;
	}
	
	public Boolean checkRotated() {
		if (inString1.length() == inString2.length()) { //check lengths
			if ((inString1 + inString1).indexOf(inString2) != -1) { 
				//check if string 2 is found in 2 copies of string 1 put side by side
				return true;
			}
		}
		return false;
	}
}

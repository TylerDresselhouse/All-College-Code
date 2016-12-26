package edu.quinnipiac.assignment;

public class Roman {

	private String roman;
	
	public Roman(String roman) {
		this.roman = roman;
	}
	public int toArabic() {

		int numberOutput = 0;
		String stringInput = roman;
		
		int i = 0;
		while (i < stringInput.length()) {
			
			char character = stringInput.charAt(i);
			int integer = RomanDigit.valueOf(Character.toString(character)).arabic;
			
			i++;
			if (i == stringInput.length()) {
				
				numberOutput += integer;
			} else {
				
				int next = RomanDigit.valueOf((Character.toString(roman.charAt(i)))).arabic;
				if (next > integer) {
					
					numberOutput += (next - integer);
					i++;
				} else {
					
					numberOutput += integer;
				}
			}			
		}
		
		return numberOutput;
	}

	enum RomanDigit {
		I(1), V(5), X(10);
		
		private int arabic;

		RomanDigit(int arabic) {
			this.arabic = arabic;
			
		}
	}
}

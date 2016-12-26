package edu.quinnipiac.assignment;

public class Factoring {
	
	String display_lcm;
	
	public Factoring(){
		display_lcm = "";
	}
	
	public String LCM(int number){

		int divider = 2; //number we will be using to divide the main number by
		int newNumber = number; //We will use this so we don't mess with the original
		boolean flag = true; //flag for success for modding
		
		while (newNumber > 1) {
			flag = true;
			while (divider <= newNumber && flag) {
				if (newNumber % divider == 0) {
					if (display_lcm.equals("")) {
						display_lcm = "" + divider;
					} else {
						display_lcm = display_lcm + ", " + divider;
					}
					newNumber = newNumber / divider;
					flag = false;
				}
				divider++;
			}
			divider = 2;
		}
		return display_lcm;
	}
}

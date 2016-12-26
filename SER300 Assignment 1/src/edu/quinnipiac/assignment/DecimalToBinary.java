package edu.quinnipiac.assignment;

/*
 * Tyler Dresselhouse
 * Alexander Baez
 * 1/27 Assignment 1 problem
 * Submitting early for extra credit
 */
public class DecimalToBinary {

	private int number;
	
	public DecimalToBinary(int number) {
		this.number = number;
	}
	public String IntToBinary() {

		String s = "";
		while (number > 0) {
			if (number % 2 == 1) {
				s = "1" + s;
			}
			if (number % 2 == 0) {
				s = "0" + s;
			}
			number = number / 2;
		}
		return s;
	}

}

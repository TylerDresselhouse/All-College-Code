
package edu.quinnipiac.ser300.Doctor;

import com.google.common.base.Function;

//Tyler Dresselhouse

public class PrimeChecker implements Function<Integer, Boolean> {//won't work without the implementation

	public Boolean apply(Integer number) {
		for(int i = 2; i < number; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
}

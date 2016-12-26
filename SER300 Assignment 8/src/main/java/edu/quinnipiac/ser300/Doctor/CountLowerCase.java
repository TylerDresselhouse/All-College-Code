
package edu.quinnipiac.ser300.Doctor;

import com.google.common.base.CharMatcher;
import com.google.common.base.Function;

//Tyler Dresselhouse

public class CountLowerCase implements Function<String, Integer> {
	public Integer apply(String input) {
		return CharMatcher.inRange('a', 'z').countIn(input);
	}
}

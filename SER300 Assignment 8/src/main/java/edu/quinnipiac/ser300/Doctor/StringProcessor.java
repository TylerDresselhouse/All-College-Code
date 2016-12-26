
package edu.quinnipiac.ser300.Doctor;


import java.util.ArrayList;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

//Tyler Dresselhouse

public class StringProcessor {

	public StringProcessor() {		
	}
	
	public Iterable<String> iterator(String ip) {
		
		Iterable<String> result;
		ArrayList<String> removeThis = new ArrayList<String>();
		removeThis.add("."); //since removeAll needs a collection
							 //I had to do this instead of removeAll(".");
		
		result = Splitter.fixedLength(1)
				.split(ip);
		
		ArrayList<String> arrResult = Lists.newArrayList(result);
		arrResult.removeAll(removeThis);

		return arrResult;
	}

	public boolean validateEmail(String email) {
		
		CharMatcher matcher = CharMatcher.anyOf("`~!@#$%^&*()-=+{[}]|\"':;?/>.<,");
		
		Iterable<String> trimmed = Splitter.on('@').split(email);
		int result = matcher.countIn(Iterables.get(trimmed, 0));

		return (result == 0);
	}

	public Iterable<String> stringSplitter(String s) {
		
		Iterable<String> split = Splitter.fixedLength(4).split(s);

		return split;
	}
}

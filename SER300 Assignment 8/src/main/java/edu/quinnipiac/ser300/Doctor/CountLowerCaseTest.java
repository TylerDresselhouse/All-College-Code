
package edu.quinnipiac.ser300.Doctor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

import com.google.common.collect.Collections2;

//Tyler Dresselhouse

public class CountLowerCaseTest {

	@Test
	public void test() {

		ArrayList<String> start = new ArrayList<String>();
		ArrayList<Integer> end = new ArrayList<Integer>();

		start.add("qWERTYUIOP");
		start.add("asdfgHJKL");
		start.add("zXcVbNm");
		start.add("abcdefghijklmnopqrstuvwxyz");
		
		end.add(1);
		end.add(5);
		end.add(4);
		end.add(26);
		
		Collection<Integer> result = Collections2.transform(start, new CountLowerCase());
		
		assertEquals(result, end);
	}
}

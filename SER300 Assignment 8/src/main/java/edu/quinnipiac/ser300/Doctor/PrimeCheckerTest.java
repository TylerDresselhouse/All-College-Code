
package edu.quinnipiac.ser300.Doctor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.google.common.collect.Collections2;

//Tyler Dresselhouse

public class PrimeCheckerTest {

	@Test
	public void test() {

		PrimeChecker checker = new PrimeChecker();

		ArrayList<Integer> start = new ArrayList<Integer>();
		
		ArrayList<Boolean> finish = new ArrayList<Boolean>();

		start.add(1);
		start.add(3);
		start.add(7);
		start.add(12);
		
		finish.add(true);
		finish.add(true);
		finish.add(true);
		finish.add(false);
		
		Collection<Boolean> col2 = Collections2.transform(start, checker);
		
		assertEquals(col2, finish);
	}
}

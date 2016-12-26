
package edu.quinnipiac.ser300.Doctor;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

//Tyler Dresselhouse and Alex Baez

public class DoctorAnalysisTest {

	@Test
	public void test() {
		
		DoctorAnalysis1 c = null;
		try {
			c = new DoctorAnalysis1("doctor.csv");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		assertEquals(c.average(), 2.2142857142857144, .000001);
		
		assertEquals(c.ranges().get(0), 54, .5);
		assertEquals(c.ranges().get(1), 39, .5);
	}

}

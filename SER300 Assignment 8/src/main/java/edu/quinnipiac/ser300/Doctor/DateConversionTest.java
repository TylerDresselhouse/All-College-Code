
package edu.quinnipiac.ser300.Doctor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

import com.google.common.collect.Collections2;

//Tyler Dresselhouse

public class DateConversionTest {

	@Test
	public void test() {

		DateConversion dc = new DateConversion();
		ArrayList<String> collection = new ArrayList<String>();

		collection.add("01/11/1111");
		collection.add("02/22/2222");
		collection.add("12/34/5678");
		collection.add("04/24/2016");

		Collection<Date> result = Collections2.transform(collection, dc);
		
		assertEquals(collection, result); //couldn't get this to work
	}
}

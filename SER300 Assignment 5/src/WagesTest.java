import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 3/1/2016
 */

public class WagesTest {

	@Test
	public void test() {
		List<String> names = new ArrayList<String>();
		
		names.add("Jim"); names.add("Tom"); names.add("Alan"); names.add("Jack"); names.add("Bob");
		names.add("Steve"); names.add("John"); names.add("Justin"); names.add("Mary");
		names.add("Larry"); names.add("Sue");
		
		List<Integer> wages = new ArrayList<Integer>();

		wages.add(300000); wages.add(900000); wages.add(900000); wages.add(400000); 
		wages.add(800000); wages.add(300000); wages.add(800000); wages.add(400000); 
		wages.add(400000); wages.add(450000); wages.add(800000); 
		
		List<String> output = new ArrayList<String>();
		
		output.add("Larry");
		
		assertEquals(new Wages(names, wages).findWage(), output);
	}
	
	@Test
	public void test2() {
		List<String> names = new ArrayList<String>();
		
		names.add("Jim"); names.add("Larry"); names.add("Alan");
		
		List<Integer> wages = new ArrayList<Integer>();

		wages.add(300000); wages.add(200000); wages.add(300000);
		
		List<String> output = new ArrayList<String>();
		
		output.add("Larry");
		
		assertEquals(new Wages(names, wages).findWage(), output);
	}
	
	@Test
	public void test3() {
		List<String> names = new ArrayList<String>();
		
		names.add("Jim"); names.add("Tom"); names.add("Alan"); names.add("Jack"); names.add("Bob");
		names.add("Steve"); names.add("Larry");
		
		List<Integer> wages = new ArrayList<Integer>();

		wages.add(300000); wages.add(900000); wages.add(900000); wages.add(400000); 
		wages.add(300000); wages.add(400000); wages.add(800000); 
		
		List<String> output = new ArrayList<String>();
		
		output.add("Larry");
		
		assertEquals(new Wages(names, wages).findWage(), output);
	}
	
	@Test
	public void test4() {
		List<String> names = new ArrayList<String>();
		
		names.add("Justin"); names.add("Mary");
		names.add("Larry"); names.add("Sue");
		
		List<Integer> wages = new ArrayList<Integer>();

		wages.add(300000); wages.add(300000); wages.add(900000); wages.add(300000);
		
		List<String> output = new ArrayList<String>();
		
		output.add("Larry");
		
		assertEquals(new Wages(names, wages).findWage(), output);
	}
}

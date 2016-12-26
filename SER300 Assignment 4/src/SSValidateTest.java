import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 2/23/16
 */

public class SSValidateTest {
	
	List<String> input = new ArrayList<String>();

	List<String> output = new ArrayList<String>();
	

	
	@Test
	public void test() {
		output.add("987-65-4321");
		
		input.add("987-65-4321");
		input.add("987-765-4321");
		
		assertEquals(new SSValidate(input).Validate(), output);
	}
	
	@Test
	public void test2() {
		output.add("123-45-6789");
		output.add("987-65-4321");
		output.add("192-83-7465");
		
		input.add("123-45-6789");
		input.add("987-5-4321");
		input.add("987-65-43");
		input.add("987-65-4321");
		input.add("9897-65-4321");
		input.add("192-83-7465");
		
		assertEquals(new SSValidate(input).Validate(), output);
	}
	
	@Test
	public void test3() {
		output.add("987 65 4321");
		
		input.add("987 65 4321");
		input.add("987 765 4321");
		input.add("98 65 4321");
		input.add("987  5 4321");
		input.add("987 65 43221");
		
		assertEquals(new SSValidate(input).Validate(), output);
	}
	
	@Test
	public void test4() {
		output.add("987 65 4321");
		
		input.add("987 65 4321");
		input.add("987 765 4321");
		input.add(" 987 65 4321");
		input.add("987  65 4321");
		input.add("98 65 321");
		
		assertEquals(new SSValidate(input).Validate(), output);
	}

}

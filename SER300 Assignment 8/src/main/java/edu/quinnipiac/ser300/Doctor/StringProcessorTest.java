
package edu.quinnipiac.ser300.Doctor;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

//Tyler Dresselhouse

public class StringProcessorTest {

	ArrayList<String> test = new ArrayList<String>();
	
	@Test
	public void ipTest1() {
		
		StringProcessor sP = new StringProcessor();
		
		test.add("1");
		test.add("1");
		test.add("1");
		test.add("1");
		test.add("1");
		test.add("1");
		test.add("1");
		test.add("1");
		
		assertEquals(test, sP.iterator("111.111.1.1"));	
	}
	
	@Test
	public void ipTest2() {
		
		StringProcessor sP = new StringProcessor();
		
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		test.add("6");
		test.add("7");
		test.add("8");
		test.add("9");
		
		assertEquals(test, sP.iterator("12.345.67.89"));	
	}
	
	@Test
	public void ipTest3() {
		
		StringProcessor sP = new StringProcessor();
		
		test.add("8");
		test.add("6");
		test.add("7");
		test.add("5");
		test.add("3");
		test.add("0");
		test.add("9");
		test.add("9");
		test.add("9");
		test.add("9");
		test.add("9");
		
		assertEquals(test, sP.iterator("867.53.099.999"));	
	}

	@Test
	public void emailTest1() {
		
		StringProcessor sP = new StringProcessor();
		
		assertEquals(true, sP.validateEmail("ttd995@gmail.com"));
	
	}
	
	@Test
	public void emailTest2() {
		

		StringProcessor sP = new StringProcessor();
		
		assertEquals(false, sP.validateEmail("ttdres.selhouse@quinnipiac.edu"));
	}
	
	@Test
	public void emailTest3() {
		
		StringProcessor sP = new StringProcessor();
		
		assertEquals(false, sP.validateEmail("ttdressel;hous/e@quinnipiac.edu"));
		
	}
	
	//I HAD TO BORROW THE NEXT 3 TESTS BECAUSE
	//I HAD THE SAME PROBLEM WITH THE ELEMENTS
	//BEING THE SAME, BUT NOT BEING EQUAL, AND
	//THESE TESTS SHOW IT VERY CLEARLY.
	
	@Test
	public void ss1() {

		StringProcessor sP = new StringProcessor();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("hell");
		list.add("ohow");
		list.add("arey");
		list.add("ou");
		
		//ONLY PRINT THESE OUT BECAUSE JUNIT SAYS FAILED
		//NOT SURE WHY ITERABLES<STRING> WONT TEST AGAINST COLLECTION
		System.out.println(sP.stringSplitter("hellohowareyou"));
		System.out.println(list);
		
		assertEquals("test7", list, sP.stringSplitter("hellohowareyou"));
	}
	
	@Test
	public void ss2() {
	
		StringProcessor sP = new StringProcessor();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("what");
		list.add("are");
		
		System.out.println(sP.stringSplitter("whatare"));
		System.out.println(list);
		
		assertEquals("test8", list, sP.stringSplitter("whatare"));
	}
	
	@Test
	public void ss3() {
		
		StringProcessor sP = new StringProcessor();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("toda");
		list.add("yisg");
		list.add("ood");
		
		System.out.println(sP.stringSplitter("todayisgood"));
		System.out.println(list);
		
		assertEquals("test8", list, sP.stringSplitter("todayisgood"));
	}
}

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 3/1/2016
 */

public class StringVowelsTest {

	@Test
	public void test() {
		
		List<String> words = new ArrayList<String>();
		words.add("less"); words.add("code"); words.add("evenless") ; words.add("bugs");
		
		List<String> out = new ArrayList<String>();
		out.add("less"); out.add("bugs"); out.add("code") ; out.add("evenless");

		assertEquals(new StringVowels(words).countVowels(), out);
	}


	@Test
	public void test2() {
		
		List<String> words = new ArrayList<String>();
		words.add("hello"); words.add("goodbye"); words.add("leavingsosoon") ; words.add("seeyouagain");
		
		List<String> out = new ArrayList<String>();
		out.add("hello"); out.add("goodbye"); out.add("leavingsosoon") ; out.add("seeyouagain");

		assertEquals(new StringVowels(words).countVowels(), out);
	}

	@Test
	public void test3() {
		
		List<String> words = new ArrayList<String>();
		words.add("one"); words.add("two"); words.add("three") ; words.add("four");
		
		List<String> out = new ArrayList<String>();
		out.add("two"); out.add("one"); out.add("three") ; out.add("four");

		assertEquals(new StringVowels(words).countVowels(), out);
	}

	@Test
	public void test4() {
		
		List<String> words = new ArrayList<String>();
		words.add("five"); words.add("six"); words.add("seven") ; words.add("eight");
		
		List<String> out = new ArrayList<String>();
		out.add("six"); out.add("five"); out.add("seven") ; out.add("eight");

		assertEquals(new StringVowels(words).countVowels(), out);
	}
}

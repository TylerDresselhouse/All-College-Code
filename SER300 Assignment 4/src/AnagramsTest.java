import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Tyler Dresselhouse and Alex Baez
 * 2/17/16
 */

public class AnagramsTest {

	public String one = "hello";
	public String two = "olhel";
	
	public String three = "alexbaez";
	public String four = "zeabxela";
	
	public String five = "professorrubyisokayiguess";
	public String six = "rubyprofessorguessiokayis";
	
	public String seven = "do spaces count?";
	public String eight = "dospacescount?";

	@Test
	public void test() {
		assertEquals(new Anagrams(one, two).isAnagram(), true);
	}
	
	@Test
	public void test2() {
		assertEquals(new Anagrams(three, four).isAnagram(), true);
	}
	
	@Test
	public void test3() {
		assertEquals(new Anagrams(five, six).isAnagram(), true);
	}
	
	@Test
	public void test4() {
		assertEquals(new Anagrams(seven, eight).isAnagram(), true);
	}

}

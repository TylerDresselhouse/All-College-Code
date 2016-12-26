import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * Tyler Dresselhouse
 * 2/23/16
 */
public class OrderedStringsTest {
	
	public String string = "";
	public List<String> list = new ArrayList<String>();
	
	@Test
	public void test() {
		string = "hello goodbye hi";
		
		list.add("hi");
		list.add("hello");
		list.add("goodbye");
		
		assertEquals(new OrderedStrings(string).sortWords(), list);
	}

	@Test
	public void test2() {
		string = "a a a a a bb a a a";
		
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("bb");

		assertEquals(new OrderedStrings(string).sortWords(), list);
	}
	
	@Test
	public void test3() {
		string = "sorry hi bad sax mad cereal";
		
		list.add("hi");
		list.add("bad");
		list.add("sax");
		list.add("mad");
		list.add("sorry");
		list.add("cereal");
		
		assertEquals(new OrderedStrings(string).sortWords(), list);
	}
	
	@Test
	public void test4() {
		string = "55555 4444 333 22 1";
		
		list.add("1");
		list.add("22");
		list.add("333");
		list.add("4444");
		list.add("55555");
		
		assertEquals(new OrderedStrings(string).sortWords(), list);
	}
}

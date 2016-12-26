import static org.junit.Assert.*;
import org.junit.Test;
/*
 * Tyler Dresselhouse
 * 9 February 2016
 */

public class ShapesAndPointsTest {

	//Since I have no idea what you were talking about regarding the input
	//and output system, I decided to simplify it down to a true/false system
	//with only one point and one shape.
	
	@Test
	public void test_check_first_point() {		
		assertEquals("Check first point", new ShapesAndPoints()
				.isPoint('r', 0.0, 0.0, 10.0, 10.0, 2.0, 2.0), true);
	}
	
	@Test
	public void test_check_second_point() {		
		assertEquals("Check second point", new ShapesAndPoints()
				.isPoint('c', 0.0, 0.0, 10.0, 2.0, 2.0), true);
	}

	@Test
	public void test_check_third_point() {		
		assertEquals("Check third point", new ShapesAndPoints()
				.isPoint('r', 0.0, 0.0, 10.0, 10.0, 20.0, 20.0), false);
	}
	
	@Test
	public void test_check_fourth_point() {		
		assertEquals("Check fourth point", new ShapesAndPoints()
				.isPoint('c', 0.0, 0.0, 1.0, 2.0, 2.0), false);
	}
}

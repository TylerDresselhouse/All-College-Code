package edu.quinnipiac.assignment;

/*
 * Tyler Dresselhouse
 * 1/31/16
 */

import org.junit.Assert;
import org.junit.Test;

public class IndexingToZeroTest {

	IndexingToZero array = new IndexingToZero();
	
	@Test
	public void test_Indexing(){
		Assert.assertNotSame(array.getAnArray(), array.operation());
	}
}
import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Alex Baez and Tyler Dresselhouse
 */

public class IsomorphicStringsTest {

	@Test
	public void test() {
		assertEquals(new IsomorphicStrings("abccde", "fghhij").areIso(), true);
	}

	@Test
	public void test2() {
		assertEquals(new IsomorphicStrings("one", "abc").areIso(), true);
	}

	@Test
	public void test3() {
		assertEquals(new IsomorphicStrings("aabbcde", "zzyyxwv").areIso(), true);
	}

	@Test
	public void test4() {
		assertEquals(new IsomorphicStrings("fourscoreandsevenyearsago", "gntqrbnqdzmcrdudmxdzqrzfn").areIso(), true);
	}
}

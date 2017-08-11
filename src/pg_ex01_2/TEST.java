package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TEST {

	@Test
	public void test1() {
		pg_ex01_2 test = new pg_ex01_2();
		assertEquals("I", test.test(1));
		assertEquals("変換出来ません", test.test(50));
	}

}

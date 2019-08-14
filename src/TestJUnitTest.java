import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestJUnitTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	//test -1 plus 1
	@Test
	void test1() {
		int expected = 0;
		TestJUnit testJUnit = new TestJUnit();
		assertEquals(expected, testJUnit.addTwoNums(-1,1));
	}

	void test2() {
		int expected = 5;
		TestJUnit testJUnit = new TestJUnit();
		assertEquals(expected, testJUnit.addTwoNums(2, 3));
	}
}

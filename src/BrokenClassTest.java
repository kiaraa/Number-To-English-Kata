import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BrokenClassTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testCaseCardMatch() {
		BrokenClass brClass = new BrokenClass();
		boolean expected = true;
		assertEquals(expected, brClass.isCardAMatch("club", "club"));
	}
	
	@Test
	public void testCaseCardMismatch() {
		BrokenClass brClass = new BrokenClass();
		boolean expected = false;
		assertEquals(expected, brClass.isCardAMatch("club", "spade"));
	}
	
	@Test
	public void testSecretsEncoding() {
		BrokenClass brClass = new BrokenClass();
		String expected = "c2VjcmV0";
		String actual = brClass.baseEncodeFileName("secret");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRoundUp() {
		BrokenClass brClass = new BrokenClass();
		long expected = Math.round(23.2);
		long actual = brClass.roundUp(23.2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLargeSum() {
		BrokenClass brClass = new BrokenClass();
		int expected = 4;
		int actual = brClass.sum(2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOverflowSum() {
		BrokenClass brClass = new BrokenClass();
		long expected = (long) 2147483648.0;
		int actual = brClass.sum(2147483647, 1);
		
		assertEquals(expected, (long) actual);
	}
}

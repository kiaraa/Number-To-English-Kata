import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TempConverterTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test32F() {
		int expected = 0;
		TempConverter converter = new TempConverter();
		int actual = converter.convert(32, "C");
		assertEquals(expected, actual);
	}
	
	@Test
	void test100C() {
		int expected = 212;
		TempConverter converter = new TempConverter();
		int actual = converter.convert(100, "F");
		assertEquals(expected, actual);
	}
	
	@Test
	void testNeg40C() {
		int expected = -40;
		TempConverter converter = new TempConverter();
		int actual = converter.convert(-40, "F");
		assertEquals(expected, actual);
	}
	
	

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumToEngTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testOne() {
		NumToEng translator = new NumToEng();
		String expected = "one";
		String actual = translator.translateDigit(1);
		assertEquals(expected, actual);
	}

	@Test
	void testTwo() {
		NumToEng translator = new NumToEng();
		String expected = "two";
		String actual = translator.translateDigit(2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testElevenInDigitTranslator() {
		NumToEng translator = new NumToEng();
		String expected = "ERROR";
		String actual = translator.translateDigit(11);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetDigits() {
		NumToEng translator = new NumToEng();
		int [] expected = {0,0,0,1};
		int [] actual = translator.getDigits(1);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void getMoreTestDigits() {
		NumToEng translator = new NumToEng();
		int [] expected = {0,0,0,3};
		int [] actual = translator.getDigits(3);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void getTestDigitsTwoDigitNum() {
		NumToEng translator = new NumToEng();
		int [] expected = {0,0,2,3};
		int [] actual = translator.getDigits(23);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void getTestDigitsAnotherTwoDigitNum() {
		NumToEng translator = new NumToEng();
		int [] expected = {0,0,7,5};
		int [] actual = translator.getDigits(75);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void getTestDigitsThreeDigitNum() {
		NumToEng translator = new NumToEng();
		int [] expected = {0,6,2,3};
		int [] actual = translator.getDigits(623);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void getTestDigitsFourDigitNum() {
		NumToEng translator = new NumToEng();
		int [] expected = {5,2,3,9};
		int [] actual = translator.getDigits(5239);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void getTestDiffDigitsFourDigitNum() {
		NumToEng translator = new NumToEng();
		int [] expected = {7,6,8,3};
		int [] actual = translator.getDigits(7683);
		assertArrayEquals(expected, actual);
	}
	@Test
	void testElevenTeen() {
		NumToEng translator = new NumToEng();
		String expected = "eleven";
		int [] testArr = {0, 0, 1, 1};
		String actual = translator.translateTeens(testArr);
		assertEquals(expected, actual);
	}

	@Test
	void testTwelveTeen() {
		NumToEng translator = new NumToEng();
		int [] testArr = {0, 0, 1, 2};
		String expected = "twelve";
		String actual = translator.translateTeens(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testTwenties() {
		NumToEng translator = new NumToEng();
		int [] testArr = {1, 0, 2, 2};
		String expected = "twenty";
		String actual = translator.translateTensPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testThirties() {
		NumToEng translator = new NumToEng();
		int [] testArr = {4, 7, 3, 1};
		String expected = "thirty";
		String actual = translator.translateTensPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSeventies() {
		NumToEng translator = new NumToEng();
		int [] testArr = {4, 6, 7, 3};
		String expected = "seventy";
		String actual = translator.translateTensPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSeventeen() {
		NumToEng translator = new NumToEng();
		int [] testArr = {9, 3, 1, 7};
		String expected = "seventeen";
		String actual = translator.translateTensPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSixHundreds() {
		NumToEng translator = new NumToEng();
		int [] testArr = {9, 6, 1, 7};
		String expected = "six hundred";
		String actual = translator.translateHundredsPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNineHundreds() {
		NumToEng translator = new NumToEng();
		int [] testArr = {0, 9, 0, 7};
		String expected = "nine hundred";
		String actual = translator.translateHundredsPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNineThousands() {
		NumToEng translator = new NumToEng();
		int [] testArr = {9, 9, 1, 5};
		String expected = "nine thousand";
		String actual = translator.translateThousandsPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testOneThousands() {
		NumToEng translator = new NumToEng();
		int [] testArr = {1, 9, 1, 5};
		String expected = "one thousand";
		String actual = translator.translateThousandsPlace(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringAssembly() {
		NumToEng translator = new NumToEng();
		int [] testArr = {1, 9, 2, 3};
		String expected = "one thousand nine hundred twenty three";
		String actual = translator.assembleString(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringAssemblyAgain() {
		NumToEng translator = new NumToEng();
		int [] testArr = {6, 4, 6, 4};
		String expected = "six thousand four hundred sixty four";
		String actual = translator.assembleString(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringAssemblyWithTeens() {
		NumToEng translator = new NumToEng();
		int [] testArr = {8, 2, 1, 9};
		String expected = "eight thousand two hundred nineteen";
		String actual = translator.assembleString(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringAssemblyWithNoTens() {
		NumToEng translator = new NumToEng();
		int [] testArr = {6, 7, 0, 3};
		String expected = "six thousand seven hundred and three";
		String actual = translator.assembleString(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringAssemblyWithNoThousands() {
		NumToEng translator = new NumToEng();
		int [] testArr = {0, 5, 4, 3};
		String expected = "five hundred forty three";
		String actual = translator.assembleString(testArr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testStringAssemblyWithNoOnes() {
		NumToEng translator = new NumToEng();
		int [] testArr = {0, 5, 4, 0};
		String expected = "five hundred forty";
		String actual = translator.assembleString(testArr);
		assertEquals(expected, actual);
	}
	
	
}

import java.util.Base64;
import java.util.Base64.Encoder;

/**
 * @author Maurice Tedder
 * Sample Class for JUnit Testing
 */
public class BrokenClass {	
	
	/*
	 * Return true if String parameter 1 is equal to parameter 2. Ignoring case.
	 */
	public boolean isCardAMatch(String card1, String card2) {
		return card1.equalsIgnoreCase(card2);
	}
	
	/*
	 * Encodes string input parameter to Base64 encoding and
	 * returns value as a string.
	 * Input of "secret" should return c2VjcmV0.
	 */
	public String baseEncodeFileName(String fileName) {
		Encoder encoder = Base64.getEncoder();				
		String encodedBytes = encoder.encodeToString(fileName.getBytes());				
		return String.valueOf(encodedBytes);
	}
	
	/*
	 * Return the long portion of a double input parameter
	 * that has been rounded up.
	 * 
	 * JavaDocs: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#round(double)
	 */
	public long roundUp(double input) {
		return Math.round(input);
	}
	
	/*
	 * Sum two ints. There is a hidden bug here. What is it?
	 * Hint: https://en.wikipedia.org/wiki/Cluster_(spacecraft)
	 */
	public int sum(int a, int b){
		return a + b;
	}
}
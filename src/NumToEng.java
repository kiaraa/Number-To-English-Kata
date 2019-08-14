
public class NumToEng {
	public String translateDigit(int digit) {
		switch (digit){
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "ERROR";
		}	
		
	}
	
	public int [] getDigits(int num) {
		int [] arr = new int [4];
		arr[3] = num % 10;
		int ones = arr[3];
		arr[2] = (num - arr[3]) % 100 / 10;
		int tens = arr[2] * 10;
		arr[1] = (num - (tens + ones)) % 1000 / 100;
		int hundreds = (arr[3] * 100);
		arr[0] = num / 1000;
		return arr;
	}
	
	//this method should only be called if there is a 1 in the tens place
	public String translateTeens(int [] numArr) {
		switch(numArr[3]) {
		case 0:
			return "ten";
		case 1:
			return "eleven";
		case 2:
			return "twelve";
		case 3: 
			return "thirteen";
		case 4:
			return "fourteen";
		case 5:
			return "fifteen";
		case 6:
			return "sixteen";
		case 7:
			return "seventeen";
		case 8:
			return "eighteen";
		case 9:
			return "nineteen";
		default:
			return "ERROR";
		}
	}

	public String translateTensPlace(int[] testArr) {
		int tensPlace = testArr[2];
		switch(tensPlace) {
		case 1:
			return translateTeens(testArr);
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			return "ERROR";
		}
	}

	public String translateHundredsPlace(int[] testArr) {
		return translateDigit(testArr[1]) + " hundred";
	}

	public String translateThousandsPlace(int[] testArr) {
		return translateDigit(testArr[0]) + " thousand";
	}

	public String assembleString(int[] testArr) {
		StringBuffer buffy = new StringBuffer();
		if (testArr[0] != 0) {
			buffy.append((translateThousandsPlace(testArr) + " "));
		}
		if (testArr[1] != 0) {
			buffy.append((translateHundredsPlace(testArr) + " "));
		}
		if (testArr[2] != 0) {
			buffy.append((translateTensPlace(testArr)));
		}
		else if (testArr[2] == 0) {
			buffy.append("and");
		}
		if (testArr[3] != 0 && testArr[2] != 1) {
			buffy.append(" " + translateDigit(testArr[3]));
		}
		return buffy.toString();
		
	}
	
}

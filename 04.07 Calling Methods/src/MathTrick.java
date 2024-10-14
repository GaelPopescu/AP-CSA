//Gael Popescu - 9/29/24
//This code will always result in APRILFOOL being printed. It chooses a random number and then through reversing,
//multiplying, and adding and replacing the numbers with letters it will result in LOOFLIRPA which reverses into APRILFOOL

import static java.lang.Math.abs;
public class MathTrick {
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	public static int getRandomNum()
	{	int num = (int) (Math.random() * 899 + 100);
		int firstDigit = num / 100;
		int lastDigit = num % 10;
		// complete the method
		while (abs(firstDigit - lastDigit) < 2) {
			num = (int) (Math.random() * 899 + 100);
			firstDigit = num / 100;
			lastDigit = num % 10;}
		return num;
	}
	// Step 2 & 4) reverse the digits of a number
	public static int reverseDigits (int num) {
		int firstDigit = num / 100;
		int lastDigit = num % 10;
		int midDigit = num / 10 - firstDigit * 10;
		num = lastDigit * 100 + midDigit * 10 + firstDigit;
		// complete the method
		return num;
	}
	// Step 7) replace characters in a String according to the chart
	//0 --> Y 1 --> M 2 --> P 3 --> L 4 --> R 5 --> O 6 --> F 7 --> A 8 --> I 9 --> B
	public static String replaceLtr(String str)
	{
		// complete the method
		str = str.replace('0', 'Y');
		str = str.replace('1', 'M');
		str = str.replace('2', 'P');
		str = str.replace('3', 'L');
		str = str.replace('4', 'R');
		str = str.replace('5', 'O');
		str = str.replace('6', 'F');
		str = str.replace('7', 'A');
		str = str.replace('8', 'I');
		str = str.replace('9', 'B');
		return str;
	}
	
	// Step 8) reverse the letters in a String
	public static String reverseString(String str) {
		// complete the method
		String revStr = "";
		for (int  i = str.length() - 1; i >= 0; i--) {
			revStr += str.substring(i, i + 1);
		}
		return revStr;
	}

	public static void main(String[] args)
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int num1 = getRandomNum();
		System.out.printf("1. The original number is: %d%n", num1);
//		2.	Now reverse the digits to form a second number.
		int num2 = reverseDigits(num1);
		System.out.printf("2. The reversed number is: %d%n", num2);
//		3.	Subtract the smaller number from the larger one.
		int numdiff = abs(num1 - num2);
		System.out.printf("3. The difference is: %d%n", numdiff);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
		int diffrev = reverseDigits(numdiff);
		numdiff = numdiff + diffrev;
		System.out.printf("4. The reversed number added to difference: %d%n", numdiff);
//		5.	Multiply by one million.
		diffrev = numdiff * 1000000;
		System.out.printf("5. Number times one million: %d%n", diffrev);
//		6.	Subtract 733,361,573.
		diffrev -= 733361573;
		String str = String.valueOf(diffrev);
		System.out.printf("6. Number subtracted and converted to String: %s%n", str);
//		7.	Convert the number to a string in order to replace the numbers with letters.
		str = replaceLtr(str);
		System.out.printf("7. Replaced String: %s%n", str);
//		8.	Now reverse the letters in the string to read your message backward.
		str = reverseString(str);
		System.out.printf("8. Reversed String: %s%n", str);

	}
}

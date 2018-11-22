/**************************************************
 * 
 * Created by Peter Zhu
 * Created on Nov
 * This is a program about reverse the string that user input
 * 
 *************************************************/
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNextLine()) {
			String user = scanner.nextLine();
			String reverse = Reverse(user);
			System.out.println("The reverse string is " + reverse + "\n");
		}else {
			System.out.println("Errors");
		}
	}
	
	public static String Reverse (String sentence) {
		
		String theSentenceSubString;		
		char lastCharacterOfString;
		
		if (sentence.length() > 0 ) {
			theSentenceSubString = sentence.substring(0,sentence.length() - 1);
			Reverse(theSentenceSubString);
			
			lastCharacterOfString =	sentence.charAt(sentence.length() - 1);
			String textReverse = lastCharacterOfString + Reverse(theSentenceSubString);
			
			return textReverse;
			
		}else {
			
			return sentence;
		}
		
	}

}

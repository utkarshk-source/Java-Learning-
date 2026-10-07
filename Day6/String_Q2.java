/* Check Palindrome String
 Write a Java program to check whether a given string is a palindrome.
 Example: madam → Palindrome   JAVA -> NON-Palindrom
*/

package Day6;
import java.util.Scanner;
public class String_Q2 {
	
	static String temp = "";
	
	
	 static void Palindrome(String c) {
		 String temp = "";
		for(int i = (c.length() -1); i >= 0; i--) {
			temp += c.charAt(i);
		}
		
		if(temp.equalsIgnoreCase(c)) {
			System.out.println(c+" : Word is a Palindrome.");
		}
		else {
			System.out.println(c+" : Word is not a  Palindrome.");
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please write a word for palindrome checking : ");
		String c = sc.nextLine();
		
		
		Palindrome(c);
		sc.close();
		
//		for(int i = (c.length() -1); i >= 0; i--) {
//			temp += c.charAt(i);
//		}
		
		

	}

}

/*
 * Remove Spaces from a String
  Write a Java program to remove all spaces from a given string.
  Example: Hello World Java → HelloWorldJava
 */

package Day6;
import java.util.Scanner;
public class String_Q7 {
	
	public static String spaceRemover(String s) {
		
		String trimed = s.trim();
		
			 
		return trimed.replace(" ", "");
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the sentance : ");
		String s = sc.nextLine();
		
		String sentance = spaceRemover(s);
		
		System.out.println(sentance);
		
	}

}

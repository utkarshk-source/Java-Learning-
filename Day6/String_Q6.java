
/*
 *Count Spaces in a String
  Write a Java program to count the total number of spaces in a given string.
  Example: Hello World Java → 2 
 */
package Day6;
import java.util.Scanner;

public class String_Q6 {
	
	
	public static int countSpaces(String s) {
		
		String temp = s.trim();
		int count = 0;
		
		
		for(int i = 0; i < temp.length() ; i++) {
			char ch = temp.charAt(i);
			
			if(ch == ' ') {
				count++;
			}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentance : ");
		String s = sc.nextLine();
		
		int count = countSpaces(s);
		System.out.println(count);

	}

}

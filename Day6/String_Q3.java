/*
 Count Characters in a String
 Write a Java program to count the total number of characters in a given string.
 Example: Hello → 5 
 */

package Day6;

import java.util.Scanner;

public class String_Q3 {

	public static int characterCheck(String s) {
		
		return s.length();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please write a word: ");
		String c = sc.nextLine();
		
		int i = characterCheck(c);
		System.out.println(c+" --> "+i);
		sc.close();
	}

}

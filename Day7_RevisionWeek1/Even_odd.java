/*
 1. Even or Odd Number
	Write a Java program to check whether a given integer is even or odd.
	Example: Input: 7 → Output: Odd
 */
package Day7_RevisionWeek1;
import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("Even ");
		}
		else {
			System.out.println("Odd");
		}

	}

}

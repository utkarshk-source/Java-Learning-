/*2. Positive, Negative, or Zero
	Write a Java program to check whether a given number is positive, negative, or zero.
	Example: Input: -5 → Output: Negative
*/
package Day7_RevisionWeek1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println("Positive");
		else if(num < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		
	}

}

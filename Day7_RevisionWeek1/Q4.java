/*4. Factorial of a Number
	Write a Java program to calculate the factorial of a non-negative integer using a loop.
	Example: Input: 5 → Output: 120
*/

package Day7_RevisionWeek1;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = num ; i > 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial is : "+fact);
		

	}

}

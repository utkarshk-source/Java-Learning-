/*5. Reverse a Number
Write a Java program to reverse the digits of a given integer.
Example: Input: 12345 → Output: 54321
*/

package Day7_RevisionWeek1;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Import : ");
		
		int num = sc.nextInt();
		
		int result = 0;
		
		for(; num != 0; num = num /10) {
			
			int temp = num % 10;
			
			
			result = result * 10 + temp;
			
			
		}
		System.out.println(result);

	}

}

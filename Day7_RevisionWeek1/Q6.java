/*6. Prime Number Check
Write a Java program to check whether a given integer is a prime number.
Example: Input: 17 → Output: Prime Number
*/

package Day7_RevisionWeek1;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}
		else {
			
			for(int i = 2; i <= num/2; i++) {
				
				if(num % i == 0) {
					isPrime = false;
					break;
				}

			}

		}
		
		if(isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		

	}

}

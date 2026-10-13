/*3. Largest of Three Numbers
	Write a Java program to accept three integers from the user and find the largest among them.
	Example: Input: 10, 25, 15 → Output: 25
*/

package Day7_RevisionWeek1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A = ");
		int a = sc.nextInt();
		
		System.out.print("B = ");
		int b = sc.nextInt();
		
		System.out.print("C = ");
		int c = sc.nextInt();
		
		int temp = 0;
		
		if(a > b && a > c) {
			System.out.println(a);
		}
		else if(b > c && b > a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
	}

}

/*3. Invalid Number Input
Question: Write a Java program to accept an integer from the user.
 Handle the exception that occurs when the user enters a non-numeric value.
*/

package Day13_exceptionalHandeling;
import java.util.Scanner;
public class Q3_NameNum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		try {
		int num = sc.nextInt();
		
		System.out.println("Number is : "+num);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		finally {
			sc.close();
		}
	}

}

/*Convert String to Uppercase
Write a Java program to convert all characters of a given string into uppercase.
Example: Hello World → HELLO WORLD
*/

package Day6;
import java.util.Scanner;
public class String_Q8_Q9 {

	public static String upperCase(String s) {
		
		return s.toUpperCase().trim();
	}
	
	public static String lowerCase(String s) {
		
		return s.toLowerCase().trim();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter characters input : ");
		String s = sc.nextLine();
		
		upperCase(s);
		
		String result = lowerCase(s);
		System.out.println(result);
		
		
	}

}

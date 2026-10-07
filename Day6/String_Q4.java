/*Count Vowels in a String
Write a Java program to count the number of vowels (a, e, i, o, u) in a given string.
Example: Hello World → 3
*/

package Day6;
import java.util.Scanner;

public class String_Q4 {

	
	public static int vowels(String s) {
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			 if (ch == 'a' || ch == 'e' || ch == 'i' || 
		                ch == 'o' || ch == 'u' ||
		                ch == 'A' || ch == 'E' || ch == 'I' || 
		                ch == 'O' || ch == 'U') {

		                count++;
		            }
		}
		
		return count;
		
			
		
	}
	
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please enter the word ");
//		
//		String s = sc.nextLine();
//		
//		int count = vowels(s);
//		
//		System.out.println(count);
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        double d = scan.nextDouble();
        scan.nextLine();   // consume line 
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
        
        scan.close();
		
		/*nextInt()     → 42
nextDouble()  → 3.1415
nextLine()    → consumes Enter
nextLine()    → "Welcome to Java!"
*/

	}

}

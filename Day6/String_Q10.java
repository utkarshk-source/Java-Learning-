/*Find Duplicate Characters
Write a Java program to find and print all duplicate characters present in a given string.
Example: programming → r, g, m
*/

package Day6;
import java.util.Scanner;
public class String_Q10 {
	
	
	static void findDuplicates(String str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {

                boolean alreadyPrinted = false;

                for (int k = 0; k < i; k++) {

                    if (str.charAt(k) == ch) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.print(ch + " ");
                }
            }
        }
      }
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter an characters input : ");
	String s = sc.nextLine();
	findDuplicates(s);

	}

}

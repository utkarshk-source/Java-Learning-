/*Find First Non-Repeated Character
Write a Java program to find the first character in a string that does not repeat anywhere else in the string.
Example: swiss → w
*/

package Day6;

import java.util.Scanner;

public class String_Q11 {

	static void findFirstNonRepeated(String str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter an characters input : ");
	String s = sc.nextLine();
	findFirstNonRepeated(s);

	}

}

/* Reverse a String
Write a Java program to reverse a given string.
Example: Hello → olleH
*/

package Day6;



public class String_Q1 {

	public static void main(String[] args) {
		
		String m = "Hello";
		int l = m.length();
		String s = "";
		
		
		for(int i = l-1 ; i >= 0 ; i--) {
			
			
			s += m.charAt(i);
		
		}
		
		System.out.println(s);
//		
	}

}

package Day13_exceptionalHandeling;
import java.util.Scanner;


public class Q4_NullString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String Input : ");
		String s = sc.nextLine();
		
		try {
			if(s.length() == 0) {
				throw new RuntimeException("String lengh is null ");
			}
			else {
			System.out.println(s.length());
			}
		}
		catch(Exception e ) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		finally {
			sc.close();
			System.out.println("True");
		}
	}
}




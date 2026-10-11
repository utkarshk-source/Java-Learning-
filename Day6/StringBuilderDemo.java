package Day6;
import java.util.Scanner;
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter input: ");
		
		StringBuilder name = new StringBuilder();
		
		name.append(sc.nextLine());
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.capacity());
		
		System.out.println(name.substring(4));
		
		System.out.println(name.charAt(5));

	}

}

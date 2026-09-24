package Day3;
import java.util.Scanner;

public class loops_2 {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Please enter the number for table: ");
	        int num = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            int table = i * num;
	            System.out.println(num + " * " + i + " = " + table);
	        }

	        sc.close();
	   }
}

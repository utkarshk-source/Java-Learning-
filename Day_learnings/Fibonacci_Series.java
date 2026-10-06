package Day_learnings;
import java.util.Scanner;

import java.util.Scanner;
// 0 1 1 2 3 5 8 13 21 34


public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number : ");
		
		int num1 = sc.nextInt();
		
		int var1 = 0, var2 = 1;
		System.out.print(var1 +", "+var2+", ");
		
		for(int i = 1; i <= num1 ; i++) {
			
			int var3 = var1 + var2 ; 
			
			var1 = var2;
			var2 = var3;
			System.out.print(var2+", ");
		}
		 
		sc.close();
	}

}

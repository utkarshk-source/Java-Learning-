package Day_learnings;
import java.util.Scanner;

public class Sum_Natural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number for sum : ");
		int num = sc.nextInt();
		
		int i = 1, sum = 0;
		
		while(i <= num) {
			
			sum = sum + i ;
			i++;
		}	
		System.out.println("Sum of natural numbers till "+num+" : "+sum);               

	}

}

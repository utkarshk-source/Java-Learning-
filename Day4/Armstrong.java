package Day4;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number : ");
		int num1 = sc.nextInt();
		
		int power = 0, power1 = 0, result  = 0;
		
		int num = num1;
		
		for(; num > 0 ; num  = num/10) {
			int digit = num % 10;
			power1++;   	// cout digit 

		}   
		
		power  = power1;   // copy of power value
		
		if(num1 >= 0 && num1 <= 9) {
			System.out.println(num+" Number is armstrong ");
		}
		else {
			num = num1;  // making num = original num1 
			
											//calculate the armstrong number 
		for ( ; num > 0 ; num = num /10) {  // Runes digits time 
			int digit = num % 10;
			int temp2 = 1;
			
			power  = power1;             
			
			for(;  power > 0 ;  power--) {       // power value become 0 at the end of the inside loop 
				temp2 = temp2 * digit;           //
				
			}
			result = result + temp2 ;
		  }
			if (result == num1) {
				System.out.println(num1+" is a Armstrong ");
			}
			else {
				System.out.println(num1+" not AN ARMSTRONG ");
			}
		}
		sc.close();
	}

}

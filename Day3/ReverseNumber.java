package Day_learnings;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number : ");
		int num = sc.nextInt();
		
		int rever = 0;
		
		
		for(; num != 0 ; num = num / 10) {
			
			int temp = num % 10;
			
			rever = (rever * 10) + temp;
			

		}
		System.out.println(rever);
	}
}

//=============================================
/*  int reverse = 0;

        while (num != 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }  
        */


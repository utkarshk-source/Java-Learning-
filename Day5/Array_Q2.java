//(Easy) Take n numbers as input from the user, store them in an array, and print them.


package Day5;
import java.util.Scanner;

public class Array_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		for(int i = 0; i < size ; i++) {
			
			System.out.print("Enter number : ");
			num[i] = sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("the output numbers : ");
		for(int j = 0; j< num.length;j++ ) {
			System.out.println("output number is "+num[j]);
		}

	}

}

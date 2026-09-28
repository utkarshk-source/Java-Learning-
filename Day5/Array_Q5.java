/*
 * (Easy) Find the sum and average of all elements.
Input: [3, 7, 2, 8] → Output: Sum = 20, Average = 5.0
 */

package Day5;
import java.util.Scanner;

public class Array_Q5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the element size : ");
		int size = sc.nextInt();
		int sum = 0;
		float avarage = 0.0f;
		
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("inpur : ");
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
			avarage = (float)sum / arr.length;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Avarage :"+avarage);
	}

}

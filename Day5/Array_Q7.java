//(Easy) Count how many elements are even and how many are odd.
package Day5;
import java.util.Scanner;
public class Array_Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
		int even = 0;
		
		
		System.out.println("Enter the "+n+" elements : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i= 0; i < arr.length; i++ ) {
			
			if(arr[i] % 2== 0  ) {
				even++;
			}
			
		}
		System.out.println("There are "+even+" Even numbers.");
		System.out.println("There are "+(arr.length - even)+" Odd numbrs ");
	}

}

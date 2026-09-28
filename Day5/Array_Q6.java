//(Easy) Find the maximum and minimum element in a single traversal.

package Day5;
import java.util.Scanner;
public class Array_Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr= new int[5];
		
		System.out.println("Enter the 5 elements : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 1 ; i < arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Min : "+min);
		System.out.println("Max : "+max);

	}

}

//(Medium) Reverse an array in place (no extra array).
//Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1]



package Day5;
import java.util.Scanner;
//public class Array_Q8 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the size of elements: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		System.out.println();
//		System.out.println("Enter "+n+" elements : ");
//		
//		for(int i= 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = arr.length - 1; i >= 0 ; i--) {
//			
//			System.out.print(arr[i]+", ");
//		}
//		
//		
//	}
//
//}
/* ⚠️ One important difference

   Your code prints the array in reverse, but it does not reverse the array in place.

   For example, the original array remains:
*/

//==============================================================
public class Array_Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println();
		System.out.println("Enter "+n+" elements : ");
		
		for(int i= 0; i < arr.length; i++) {    		//taking input
			arr[i] = sc.nextInt();
		}
		
		int start = 0;
		int end = n-1;
		
		while(start < end) {     					//swipe values 
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
													//outpt print 
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+", ");
		}
		
	}

}



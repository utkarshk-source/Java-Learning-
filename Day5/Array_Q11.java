/*11. **(Medium)** Rotate an array left by one position.
    Input: `[1, 2, 3, 4]` → Output: `[2, 3, 4, 1]`
*/

package Day5;
import java.util.Scanner;
public class Array_Q11 {

	public static void main(String[] args) {
//		int[] arr = new int[] {1, 2, 3, 4};
//		
//		int temp = arr[0];
//		int j =0;
//		int[] arr2 = new int[arr.length];
//		
//		for(int i = 1; i < arr.length ; i++) {
//			arr2[j] = arr[i];
//			j++;
//		}
//		arr2[arr.length -1 ] = temp;
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i]+", ");
//		}
//
//	}
//
//}
	
		Scanner sc = new Scanner(System.in);
		System.out.println( "Plese enter the size of the array : ");
		
		int size= sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter "+size+ " elements : ");
		
		//Taking Inputs 
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[0];
		
		for(int i = 0; i < arr.length -1 ; i++) {
			arr[i] = arr[i +1];
		}
		
		arr[arr.length -1 ]= temp;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
	}
}


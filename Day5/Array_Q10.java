/*(Medium) Move all zeros to the end while keeping the order of other elements.
Input: [0, 1, 0, 3, 12] → Output: [1, 3, 12, 0, 0]
*/

package Day5;

public class Array_Q10 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {0 , 1 , 0, 3 , 12};
		int[] arr2 = new int[arr.length];
		
		int j = 0;
		
		for(int i = 0; i < arr.length ;i++) {
			
			if(arr[i] != 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		
	
		for(int i = 0; i < arr2.length ; i++) {
			System.out.print(arr2[i]+", ");
		}
	}

}

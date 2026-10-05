//Bubble Sort 

package Day5;

public class Array_Sorting {

	public static void main(String[] args) {
		
		int[] arr = new int[] {36 , 19, 29 , 12, 5};
		
		int temp = 0;
		
		for(int i = 0; i < arr.length ; i++ ) {
			
			int flag = 0;
			for(int j = 0; j < (arr.length -1) - i; j++) {
				
				if(arr[j] > arr[j +1]) {
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j +1] = temp;
					
					flag = 1; // if short is not done it will be always 1
				}
			}
			if(flag == 0) {
				break;    // once the flag is not 1 so it will be outside of 1st loop
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	
	}
	

}

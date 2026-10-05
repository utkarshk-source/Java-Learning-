package Day5;

public class Sorting_demo {
	
	public static void bubbleSort(int arr[], int n) {
		boolean swapped;
		int temp;
		for(int  i = 0; i < arr.length; i++) {
			swapped = false;
			
			for(int j =0; j < arr.length -1 ; j++) {
				
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapped = true;
					
				}
				
				
			}
			
			if(swapped == false) {
				break;
			}
		}
		
	}

	public static void selectionSort(int arr[], int n) {
		int min, temp;
		
		for(int i = 0; i < n; i++) {
			
			min = i;
			for(int j = i+1; j < n; j++) {
				
				if(arr[j] < arr[min])
					min = j;
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println("Sorted by selection sort.");
	}

	public static void main(String[] args) {
		int[] arr = new int[] {38, 52, 9 , 18 , 6, 62 , 13};
		int n = arr.length;
//		bubbleSort(arr, n);
		
		selectionSort(arr, n);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}

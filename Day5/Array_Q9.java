//(Medium) Find the second largest element without sorting.
//Input: [12, 35, 1, 10, 34] → Output: 34


package Day5;

//import java.util.Scanner;
//
//public class Array_Q9 {
//
//	public static void main(String[] args) {
//		
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the size of elements: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		int[] arr2 = new int[n-1];
//		
//		System.out.println();
//		System.out.println("Enter "+n+" elements : ");
//		
//		for(int i= 0; i < arr.length; i++) {    		//taking input
//			arr[i] = sc.nextInt();
//		}
//		
//		int max = arr[0];
//		int max2 = 0;
//		
//		for(int i = 1; i < arr.length; i++) {
//			
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		  
//		System.out.println("Maximum value of elements is : "+max);
//		//remove the max value from arr[] and make new array arr2[] without the previous max value 
//		int j =0;
//		for(int i = 0 ; i < arr.length; i++) {     
//			
//			if(max != arr[i]) {
//				arr2[j] = arr[i];   // copy arr[] to arr2[] except the max value 
//				j++;
//			}
//			
//		}
//		
//		//print the max value of arr2[]
//		max = arr2[0];
//		for(int i = 0; i < arr2.length; i++) {
//			
//			if(max < arr2[i]) {
//				max = arr2[i];
//			}
//			
//		}
//		System.out.println("2nd Max element is : "+max);
//		        sc.close();
//	}
//
//}
//
//So your logic is valid, but you need a separate index when copying into arr2.
//
//One more thing: this solution assumes there is a distinct second-largest value.
//If the array contains duplicates such as [10, 10, 5], the expected definition of "second largest" needs to be decided.
//===============================================================

import java.util.Scanner;

public class Array_Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        // taking input 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }     

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}

/*12. **(Hard)** Rotate an array right by `k` positions.
    Input: `[1, 2, 3, 4, 5]`, k = 2 → Output: `[4, 5, 1, 2, 3]`
    */

package Day5;
import java.util.Scanner;

public class Array_Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter "+n+" elements inside: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the rottation times : ");
		int k = sc.nextInt();
		
		k = k % n;
		
		int[] result = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			result[(i + k) % n ] = arr[i];
		}
		
		System.out.println("**Rottated Elements**");
		System.out.print("[ ");
		for(int i : result) {
			System.out.print(i+" ");
		}
		System.out.print("]");


		sc.close();
	}

}

/* Hint : 1. k = k % n;

Think of this as:

"Remove unnecessary full rotations."
5 rotations = 0 rotations
10 rotations = 0 rotations
15 rotations = 0 rotations

k = 7;
n = 5;

k = k % n;

means:

7 % 5 = 2

If someone says:

"Move 27 hours forward."

You don't need to count 27 hours.

Since a clock has 24 hours:

27 % 24 = 3

So you're really only moving 3 hours forward.


2. result[(i + k) % n] = arr[i];

This one looks scary, but let's break it into two pieces.

The question we're asking is:

"Where should the current element go after rotating right by k?"

Suppose:

arr = [1, 2, 3, 4, 5]
k = 2
n = 5

We want:

[4, 5, 1, 2, 3]

*/

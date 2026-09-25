package Day4;
import java.util.Scanner;




/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/


//public class Pattern {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i = 0; i <= num ; i++) {
//							
//				for(int j = 0 ; j <= num ; j++) {
//					System.out.print("* ");
//				}
//				System.out.println("");
//			}
//		sc.close();
//		}
//	}
//
//====================================================

/*

*
* *
* * *
* * * *
* * * * *

*/


//public class Pattern {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i= 1 ; i < num; i++) {
//			
//			for(int j = 0; j < i; j++) {
//				System.out.print(" *");
//			}
//			System.out.println("");
//		}
//		
//		sc.close();
//	}
//}
//
//===========================================================================


/*
 
* * * * *
* * * *
* * *
* *
*

 */

//public class Pattern {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i = num; i > 0 ; i--) {
//			
//			for(int j = i ; j > 0 ; j--) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//
//
//		sc.close();
//	}
//}
//==================================================

/*
 * * * * *
  * * * *
    * * *
      * *
        *
 */


//public class Pattern {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i = num ; i > 0 ; i--) {   // n = 5 
//			 								// i = 5 4 3 2 1 
//			for(int j = 0 ; j < num ; j++) {
//				if((num - i) <= j) {
//					System.out.print("*");
//				}
//				else {
//				System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
//
//
//		sc.close();
//	}
//}
//================================================

/*
 *
 **
 ***
 ****
 *****
 */


//
//public class Pattern {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i < num ; i++) {
//			
//			for(int j = i; j > 0 ; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//
//		sc.close();
//	}
//}


/* 
 
*****
****
***
**
*
 
 */

//public class Pattern {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i = num; i > 0 ; i-- ) {
//			
//			for(int j = i; j > 0 ; j-- ) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//
//		sc.close();
//	}
//}
//==================================================================


/*
 Question: Print a rectangle of 4 rows and 6 columns.

* * * * * *
* * * * * *
* * * * * *
* * * * * *

 */
//public class Pattern {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		for(int i = num - 2; i > 0; i--) {
//			
//			for(int j = 0; j < num; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//
//		sc.close();
//	}
//}
//=========================================================================

/* 4. Right Triangle

Question: Print a right-aligned triangle.

        *
      * *
    * * *
  * * * *
* * * * *
*/

//public class Pattern {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Please enter the number : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			
//			for(int j=1 ; j <= num-i; j++) {       //print spaces 
//				System.out.print(" ");
//			}
//			
//			for(int k = 1; k <= i ; k++) {      // print start after spaces 
//				System.out.print("*");
//			}
//			
//			System.out.println("");
//		}
//		
//
//		sc.close();
//	}
//}
//=================================================

/*9. Full Pyramid
    *
   ***
  *****
 *******
*********

*/

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number : ");
		int n = sc.nextInt();
		
		  // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
		

		sc.close();
	}
}










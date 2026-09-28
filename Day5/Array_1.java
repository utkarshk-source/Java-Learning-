package Day5;
import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		
		
		int[] a ;
		a = new int[3];
		
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		
		int[] b = {10 ,20, 35};
		
		for(int i =0; i < b.length; i++) {
			System.out.print(b[i]+"-- ");
		}
		System.out.println();
		for(int i  : a ) {                 //taking data of a by for each loop 
			System.out.print(i+"--- ");
		}		System.out.println();

			//========================2-D Array============
			
			int[][] a1;			  // Declaration of metrix 2-D Array
			a1 = new int[2][3];   // matrix array 
			
			// or int[][] a1 = new int[2][3];
			
			a1[0][0] = 10;          // initialization of Metrix 2D Array 
			a1[0][1] = 20;     
			a1[0][2] = 30;
			
			a1[1][0] = 40;
			a1[1][1] = 50;
			a1[1][2] = 60;
			
			// jacked array 
			
			int[][] a2 = new int [3][];   // declaration then creation
			a2[0] = new int[2];           // one 
			a2[1] = new int[3];
			a2[2] = new int[2];
			
			a2[0][0] = 22;
			a2[0][1] = 33;
			
			
			a2[1][0] = 44;
			a2[1][1] = 55;
			a2[1][2] = 66;
			
			a2[2][0] = 77;
			a2[2][1] = 88;
			
			
			
			for(int i = 0; i < a2.length ; i++) {
				System.out.println(" " );
				
				for(int j = 0; j < a2[i].length ; j++) {
			     System.out.println(a2[i][j]+", ");
				} 
			}
			
			//int[][][] a3 = new int [3][][];   // declaration then creation
			
			// 3-D Array
			
			
			
			int[][][] a3 = {{ {10, 20,30}, {40,50}, {60,70} }} ;
			
			for(int i = 0; i < a3.length ; i++) {
				System.out.println("");
				
				for(int j =0; j < a3[i].length ; j++) {
					
					for(int k= 0; k < a3[i][j].length; k++) {
						System.out.print(a3[i][j][k]+", ");
					}				
			
				}
			
			}
			
	}
}
			
			
			
			
		
		
		

	



/*
 * Write a Java program to divide two numbers. 
 * Handle the exception that occurs when the divisor is zero.
 */

package Day13_exceptionalHandeling;


public class Q1 {

	public static void main(String[] args) {
		DevideZero d = new DevideZero(100 , 0);
		
		try {
		d.getData();
		}
		catch(Exception e ){
			e.printStackTrace();
			
		}
		finally {
			System.out.println("NUm devided by zero ");
		}
	}

}


class DevideZero{
	
	int num1;
	int num2;
	
	 DevideZero(int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;			
	}
	
	int getData() 
	{
		return num1/ num2;
	}
}



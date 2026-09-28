package Day5;
import java.util.Scanner;

public class Method_Cal {

	public static int sum(int a , int b ) {
		return a +b;
	}
	
	
	public static int sub( int a , int b ) {

		return a - b;
		
	}
	
	public static int multi( int a , int b ) {
		return a * b;
		
	}
	public static float div( int a , int b ) {
		return a / b;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Please enter the number 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter a operator(+ , - , * , / ): ");
		String c = sc.next();
		
		int result = 0; 
		
		if(c.equals("+")) {
			

			result = Method_Cal.sum(num1 , num2);
			System.out.println("Sum of "+num1+" and "+num2+" is = "+result);
		}
		
		else if(c.equals("-")) {

			result = Method_Cal.sub(num1 , num2);
			System.out.println("Subtraction of "+num1+" and "+num2+" is = "+result);
		}
		
		else if(c.equals("*")) {

			result = Method_Cal.multi(num1 , num2);
			System.out.println("multiplication of "+num1+" and "+num2+" is = "+result);
		}
		
		else if(c.equals("/")) {

			float result2 = (Method_Cal.div(num1 , num2));
			System.out.println("Division of "+num1+" and "+num2+" is = "+result2);
		}
		
		else {
			System.out.println("Please enter the correct operator ");
		}
		
	}

}

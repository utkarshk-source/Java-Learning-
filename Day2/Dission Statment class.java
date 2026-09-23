//import java.util.Scanner;
//public class DecisionStatment {
//	
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a numnber : ");
//		int num = sc.nextInt();
//		
//		if (num > 0 || num <0) {
//			if(num % 2 == 0) {
//				System.out.println("NUMBER IS EVEN");
//			}
//			else {
//				System.out.println("NUMBER IS ODD ");
//			}
//		}
//		else {
//			System.out.println("NUMBER IS ZERO");
//		}
//				
//	}
//}
// -   -----------------------------------------------------------------------

//import java.util.Scanner;
//class DecisionStatment{
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter a Number 1 : ");
//		int num1  = sc.nextInt();
//		
//		System.out.print("Enter a Number 2 : ");
//		int num2  = sc.nextInt();
//		
//		if(num1 > num2 ) {
//			System.out.println(num1+ " NUM IS GREATER ");
//		}
//		else {
//			System.out.println(num2 +" NUM IS GREATER ");
//		}
//	}
//}
//-----------------------------------------------------------

//import java.util.Scanner;
//class DecisionStatment{
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("ENTER THE 1ST NUM : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("ENTER THE 2ST NUM : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("ENTER THE 3ST NUM : ");
//		int num3 = sc.nextInt();
//		
//		if(num1 > num2 && num1 > num3) {
//			System.out.println(num1+ " Num is Greater..");
//		}
//		else if(num2 >= num3 && num2 >= num1) {
//			System.out.println(num2+ " Num is Greater..");
//		}
//		else  {
//			System.out.println(num3+ " Num is Greater..");
//		}
//		
//	}
//}


//import java.util.Scanner;
//class DecisionStatment{
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("ENTER THE 1ST NUM : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("ENTER THE 2ST NUM : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("ENTER THE 3ST NUM : ");
//		int num3 = sc.nextInt();
//		
//		if (num1 > num2) {
//			if(num1 > num3) {
//				System.out.println("1st number is greater which is "+num1);
//			}
//			else {
//				System.out.println("3rd number is greater which is "+num3);
//			}
//		}
//		else if(num2 > num1) {
//			if(num2 > num3 ) {
//				System.out.println("2nd number is greater which is "+num2);
//			}
//			else {
//				System.out.println("3rd number is greater which is  "+num3);
//			}
//		}
//	sc.close();
//
//	}
//}
//----------------------------------------------------------------------------------------------

//import java.util.Scanner;
//class DecisionStatment{
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("ENTER YEAR : ");
//		int year = sc.nextInt();
//		
//		if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0  ) {
//			System.out.println(year+ " Year is a Leap Year");
//		}
//		else {
//			System.out.println(year+" Year is not a Leap year.");
//		}
//	}
//}
//

//import java.util.Scanner;
//public class DecisionStatment{
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter number between 1 - 12 : ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//		case 1 : 
//			System.out.println("January ");
//			break;
//			
//		case 2 : 
//			System.out.println("fabuary ");
//			break;
//			
//		case 3 : 
//			System.out.println("march ");
//			break;
//			
//		case 4 : 
//			System.out.println("April ");
//			break;
//
//		case 5 : 
//			System.out.println("may ");
//			break;
//		default:
//			System.out.println("Pease enter a correct number!!!");
//			
//		
//		
//		}
//	}
//}
//--------------------------------------------------------------------------------------


import java.util.Scanner;
public class DecisionStatment{
	public static void main(String[]arsgs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number : ");
		
		int num1 = sc.nextInt();
		
		System.out.print("Enter the 2st number : ");
		
		int num2 = sc.nextInt();
		
		System.out.print("Enter the Operation(+ , - , * , /, % ) : ");
		
		String op = sc.next();
		
		
		switch(op){
		
		case "+":{
			System.out.println("sum is : "+(num1 + num2));
			break;
			}
		case "-":{
			System.out.println("sum is : "+(num1 - num2));
			break;
			}
		case "*":{
			System.out.println("sum is : "+(num1 * num2));
			break;
			}
		case "/":{
			System.out.println("sum is : "+(num1 / num2));
			break;
			}
		case "%":{
			System.out.println("sum is : "+(num1 % num2));
			break;
			}
		default:{
		System.out.println("Please enter correct operation");
			}
		}
		
	}
}






















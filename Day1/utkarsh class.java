//public class Utkarsh{
//	public static void main(String [] args )
//	{
//		System.out.println("Hello Utkarsh, You woked up !!");
//	}
//	
//} ===========================

//public class Utkarsh{
//	public static void main(String [] args) {
//		int num1 = 20;
//		int num2 = 30;
//		
//		 System.out.println("Total is : " +(num1 + num2));
//	}
//}

//public class Utkarsh{
//	public static void main(String [] args) {
//		int a  = 2, b = 56;
//		
//		int c = 0;
//		c = a;
////		 System.out.println("a = " +a);
//		 
//		 a = b;
//		 b = c;
//		 System.out.println("a : "+a+ " b : "+b);
//	}
//}

//import java.util.Scanner;
//class Utkarsh{
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a number = ");
//		int num = sc.nextInt();
//		System.out.println("number is : "+num);
//	}
//}

import java.util.Scanner;
//
//public class Utkarsh{
//	public static void main(String [] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a temparature in celcius : ");
//		
//		float cel = sc.nextFloat();
//		
//		float fahre = (float) ((cel * 1.8) + 32);
//		
//		System.out.println("Tempreature in Farenheit : "+fahre);		
//		
//	}
//}
//

//class Utkarsh{
//	public static void main(String [] args) {
//		String name = "Utkarsh";
//		byte age = 24;
//		float hight = 6.0f;
//		boolean isStudent = true;
//		
//		System.out.println(name+ " - "+age+" - "+hight+" - "+isStudent);
//	}
//}    10 , 12, 12, 10 


//public class Utkarsh {
//    public static void main(String[] args) {
//        int x = 10;
//
//        System.out.println(x++);
//        System.out.println(++x);
//        System.out.println(x--);
//        System.out.println(--x);
//    }
//}



//public class Utkarsh{
//	public static void main(String [] args) {
//		int num1 = 12 , num2 = 13;
//		
//		int sum = num1 + num2;
//		int Difference  = num1 - num2;
//		int quotient = num1 / num2;
//		int reminder = num1 % num2;
//		
//		System.out.println(sum +" " +Difference+" "+ quotient+" "+ reminder );
//	}
//}




//class Utkarsh{
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the seconds : ");
//		
//		int second = sc.nextInt();
//		
//		int hour = ((second / 60)/60);
//		System.out.println("Hous : "+hour);
//		
//		int minuts = (second % 3600) / 60;
//		System.out.println(minuts);
//		
//		int seconds  = (second  % 60);
//		System.out.println("Seconds : "+seconds);
//		
//	}
//}


//class Utkarsh{
//	public static void main(String [] args) {
//		int a = 10, b= 20, c = 30;
//		
//		a  = ((a+b)-a);
//		b = ((b+c)-b);
//		c = ((c+a)-c);
//		
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		System.out.println("c = "+c);	}
//}




public class Utkarsh {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Before Rotation");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Swap a and b
        a = a + b;
        b = a - b;
        a = a - b;

        // Swap b and c
        b = b + c;
        c = b - c;
        b = b - c;

        System.out.println("\nAfter Rotation");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}










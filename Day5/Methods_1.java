package Day5;
import java.util.Scanner;

public class Methods_1 {
	
	public static void A() {
		C();										
		System.out.println("Inside A");
	}
	
	public static void B() 
	{
		D();
		System.out.println("Inside b");
	}
	
	public static void C() {
		B();
		System.out.println("Inside c ");
	}
	
	public static void D() {
		System.out.println("Inside D");
	}

	
	
	public static void main(String[] args) {
		
		A();                // A() -> C()-> B()-> D()-> B() -> C() -> A()
		C();					// C() -> B()-> D()-> B() -> C() 

	}

}

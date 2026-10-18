package Day10;

public class SuperKey extends ParentSupper {
	
	SuperKey(){    //constructor 
		
		super();
		
	
		//**automatic super() method write so the paent constructor called 
		System.out.println();
		System.out.println("Inside Super key child constructor");
	}
	
	void superM1() {
		
		System.out.println("Inside Child super class .");
	}
	
	int display() {
		
		superM1();
		super.superM1();
		
		int a = 10;
		int b = 10;
		
		return a +b;
	}

	public static void main(String [] args) {
	
		SuperKey s = new SuperKey();
	}
}

class ParentSupper{
	
	ParentSupper(){    //constructor 
		System.out.println("Inside the Parent Class constructor ");
	}
	
	ParentSupper(int a ){
		System.out.println(a * a);
	}
	
	void superM1() {
		
		System.out.println("Inside ParentSupper!!");
	}
}


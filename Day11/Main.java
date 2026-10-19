package Day11;

public class Main {

	String[] a;
	void display(String a ) {       //1st Method 
		System.out.println("Mehtod 1 ..");
	}
	
	void display( StringBuffer a ) {   //2nd Method 
		System.out.println("Method 2 .. ");
	}
	
	void display(String ... a) {   //varargs (variable arguments) 
		this.a = a;
		String  b = a.toString();
		System.out.println(b);
		System.out.println("Method 3 ");
	}
	public static void main(String[] args) {
		

		Main m = new Main();
		
	
//		m.display("Utkarsh");
//		m.display(new StringBuffer("Kumar"));
		m.display("Utkarsh", "Kumar", "ahirwar");
		
	}
	
	public static void main(String ab) {   //main method cam be overload
		System.out.println("Inside main copy method..");
	}

}

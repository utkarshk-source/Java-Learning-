package Day13_exceptionalHandeling;
import java.io.*;




class Ninja{
	
	void add() {
	try {
		int a =10, b =0 , c;
		c = a/b;
		
		System.out.println(c);
	}
	finally{
		System.out.println("Inside finally ");
	}
	
	}
}
public class DemoEH {

	public static void main(String[] args) {
		
		Ninja n = new Ninja();
		n.add();
		
		
		try {
		FileInputStream f = new FileInputStream("D:\\readme"); // checked exception 
	 
		}
		catch(Exception e ) {
			
//			e.printStackTrace();  // exception name , description, stack trace 
//			System.out.println(e.toString());   // exception name, descri[tipn 
			System.out.println(e.getMessage());  // description 
		
		}
		finally {
			System.out.println("Inside finally keyword .. ");
		}
	

	}

}

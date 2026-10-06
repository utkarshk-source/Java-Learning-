package Day6;

public class StringClassConstructor {

	public static void main(String[] args) {

		
		String sc = new String("Utkarsh");   //String literal constructor created 2 objects 
		
		String name = "Umesh";  // created 1 object 
		
		String name1 = new String();   // created simple one empty object 
		
		String s1 = new String(sc);  //passing string object sc
		String s2 = new String(name);   // 
 		
		System.out.println(s1);
		System.out.println(s2);
		
		//
		
		StringBuffer s3 = new StringBuffer("Ahirwar") ; //
		String surname = new String(s3);  // passing refeance of string builder 
		
		System.out.println(surname);  
		
		//
		
		byte[] num = {120, 121, 122, 123};
		String num1 = new String(num);
		System.out.println(num1);     //converted into chars 
		
		//
		
		char[] initials = {'U','T', 'K', 'A' , 'R' , 'S', 'H'};
		String initials1 = new String(initials);
		System.out.println(initials1);
		
	}

}

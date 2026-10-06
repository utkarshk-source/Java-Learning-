package Day6;

public class String_demo {

	public static void main(String[] args) {
		
//		String name = new String();
//		name = "Utkarsh";
//		
//		String middleName = "Kumar";
//		
//		String lastName = new String("Ahirwar");
//		
//		System.out.println (name+" "+middleName+  " "+lastName);
		
		String name = new String("Utkarsh");
		String name1 = new String("Utkarsh");
		
		System.out.println(name == name1);    //address reference check 
		
		String surname = new String("Ahirwar");
		String surname1 = new String("Ahirwar");
		
		System.out.println(surname.equals(surname1));   // checking the content 
		
		
		
	}

}

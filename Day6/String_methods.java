package Day6;

public class String_methods {

	public static void main(String[] args) {
		
		String name = "Utkarsh";
		String email = "   kumarutkarsh569@gmail.com   ";
		String pass = "Utkarsh@321";
		String sign = "";
		String nationality = null;
		
		int i = email.length();
		
		if(i == 0) {
			System.out.println("Empty string ");
			
		}
		System.out.println(i);
		
		System.out.println("sign IS Empty : "+sign.isEmpty());
//		System.out.println(nationality.isEmpty());    null error
		
		
		System.out.println(email.trim()); // trim the spaces before and after not in middle
		System.out.println("name.trim.length -> "+(email.trim().length()));
		
		System.out.println(email.toUpperCase().trim());  //uppper case 
		System.out.println(name.toLowerCase());            // to lower case 
		
		
		//equalInoreCase()
		String name1 = "Utkasrh";
		System.out.println("Equals() method : "+name.equals(name1));
		System.out.println("equalsIgnoreCase() method : "+name.equalsIgnoreCase(name1));
		System.out.println(name.equals(""));  // check name is empty or not 
		
		//compareTo() and compareToIgnoreCase()
		
		String c = "U";
		String c1 = "u";
		
		
		System.out.println("compareTo() : "+c.compareTo(c1)); //-32
		System.out.println("compare +c1.compareTo(c) : " +c1.compareTo(c) ); // 32
		
		System.out.println("compareToIgnoreCase : "+c1.compareToIgnoreCase(c));   // 0
		
		
		//contains() methods
		
		System.out.println("Contains method : "+name.contains("rsh"));
		
		//replace() method
		
		System.out.println(name.replace('t', 'T'));  // replace the char into 

		
		// charAt(i)
		
		System.out.println("Character in Utkarsh name at 3 : "+name.charAt(3));
		System.out.println(email.trim().charAt(5));  // charAt(Index value)
		
		//substring(start)
		//substring(start, end)
		
		System.out.println(email.trim().substring(5));
		System.out.println(email.trim().substring(0, 15));
		
		
		
		
		
		
		
		
		
		
	}

}

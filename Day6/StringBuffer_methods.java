package Day6;

public class StringBuffer_methods {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		
		s.append("Hello Java");
		System.out.println(s);
		
		
		// insert method
		//s.insert(1,  false );
		System.out.println(s);
		
		// replace() 
		
		s.replace(6, 10, "$");
		System.out.println(s);
		
		s.append(" JAVA");
		System.out.println(s);
		
		//delete() methode 
		
		s.deleteCharAt(6);
		System.out.println(s);
		
		s.delete(5, 6);
		System.out.println(s);
		
		// reverse() methode in StringBuffer 
		s.reverse();
		System.out.println(s);
		
		s.capacity();
		System.out.println(s.capacity()); //empty string 
		System.out.println(s.length());   // normal length of strigBuffer object 

		s.reverse();
		
		s.ensureCapacity(52);
		System.out.println();
		s.append(" is the Object oriente programing language .. ");
		System.out.println(s.capacity());
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Name : Kumar");
		sb.replace(7, 14, "Utkarsh");
		System.out.println(sb);
	}

}

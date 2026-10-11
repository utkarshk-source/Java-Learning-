package Day6;
import java.util.Scanner;

public class StringbufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		
		s.append("Java is a Language");  
		s.append(" Which is good.");
		s.append(" Jai ho JAVA ki.");
		
		System.out.println(s); //mutable quality
		
		System.out.println(s.capacity());
		
		
		

	}

}

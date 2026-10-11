package Day6;
import java.util.Scanner;
public class String_methods2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter 2 word ");
		
		String s1 = "Utkarsh kumar";
		String s2 = "Niwari, MP, In";
		
		System.out.println(s1 + s2 ); //utkarshkumar
		System.out.println(s1 + 10 ); //utkarsh10
		System.out.println(s1 + +10 + 20); //utkarsh1020
		
		System.out.println(s1 + 100/10);  //utkarsh10 because of boadmas rull
		
		//concat() method
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("utk"));

		//join(char delimiter , char sequence .. elements)
		
		System.out.println(s1.join("---",  s2));
		System.out.println(String.join("**", "null", s1));
		
		//subSequence()
		
		System.out.println(s1.subSequence(4, 8)); //(start , end -1) output of character sequence 
		
		System.out.println(s1.subSequence(4, 11));
		
		//.substring() : output is string sequence 
		
		System.out.println();
		System.out.println(s1.substring(0));  // (start ) to default end 
		System.out.println(s1.substring(4 , 11)); // start to end 
		
		
		System.out.println();
		
		// replace();   replaceFirst()    replaceAll()

		String s = "Cow is a pet animal, Cow is a veg animal.";
		
		System.out.println(s.replace("is", "always"));
		
		System.out.println(s.replaceAll("is", "always"));  //we can use regulaer expression on this replaceAll() 
		System.out.println(s.replaceFirst("is", "always"));
		
		System.out.println(s.replaceAll("is(.*)", "always")); 
		System.out.println(s.replaceAll("is(..)", "always"));   //remove 2 chars after both always word in sentance
		
		
		
		System.out.println("================");
		System.out.println();
		
		//Searching string methods
		
		//indexOf();             String s1 = "Utkarsh kumar";
		System.out.println(s1.indexOf('s'));  //5
		System.out.println(s1.indexOf('u'));  //9
		
		//lastIndexOf();
		
		System.out.println(s1.lastIndexOf('u'));
		
		//charAt()
		
		System.out.println(s1.charAt(4));  //r
		
		//contains()
		
		System.out.println(s1.contains("ku"));
		
		// startsWith();
		
		System.out.println(s1.startsWith("u"));  //fasle
		
		//endsWith()
		
		System.out.println(s1.endsWith("r"));   //true
		
		
		// String type conversion 
	// toUpperCase() 
		//toLowerCase()
		// valueOf() - conver into string data type
		// toCharArray - convert string to character array 
		
		int num = 69;
		System.out.println(s1);
		
		String sc1 = String.valueOf(num);
		System.out.println(num);
		
		System.out.println(sc1 + 10);
		
		char[] ch = sc1.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ,");
		}
		
		
		
		
 	}

}

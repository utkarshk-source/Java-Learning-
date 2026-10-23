package Day13_exceptionalHandeling;
import java.util.Scanner;
public class Q5_Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		byte age = sc.nextByte();
		
		try {
			if(age > 100 || age < 18) {
				
				throw new InvalidAgeException(age+" is not not Accepted. ");
			}
			else {
				System.out.println(age +" Age is Accepted .");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println(e.toString());
			
		}
		finally {
		  sc.close();}

	}

}

class InvalidAgeException extends RuntimeException{
	
	InvalidAgeException(String msg){
		super(msg);
	}
}

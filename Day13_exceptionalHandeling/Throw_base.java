package Day13_exceptionalHandeling;

class AgeLimitException extends RuntimeException{
	AgeLimitException(String msg){
		super(msg);
		System.out.println(" inside AgeLimitException");
	}
}

public class Throw_base {

	public static void main(String[] args) {
		
		byte age = 10;
		try {
			if(age < 18) {
			
				throw new AgeLimitException("Not able to put vote.");
			}
		
			else {
				System.out.println("eligible for voting.. ");
			}
		} 
		catch(Exception e) {
				
			System.out.println("Exception succesfully taken ");
		}
		finally {
			System.out.println("inside finally ");
		}
	}

}

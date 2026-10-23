package Day13_exceptionalHandeling;


public class CustomizeExceoption_Base {

	public static void main(String[] args) {
		
		int age = 16;
		String name = "utkarsh";
		
		try {
			if(age < 18) {
				
				throw new checkedException();
			}
			else {
				System.out.println("Voting succesfully.");
				}
			
		}
		catch(checkedException un ){
			un.printStackTrace();		}
	
		
		System.out.println("==================================");

		try {
			if(name.equals("Utkarsh")) {
				throw new checkedException(name);  //created exception object by the user 
			}
			else {
				System.out.println("Name is not matching...");
			}
		}
		catch(checkedException un ) {
			
			un.printStackTrace();
		}
		finally {
			System.out.println("==================================");

		}
		
		
	}

}

class checkedException extends Exception{
	
	checkedException(){
		System.out.println("Vopter is under aged..");
	}
	
	checkedException(String txt){
		System.out.println("name is ideal ");
		
	
	}
}




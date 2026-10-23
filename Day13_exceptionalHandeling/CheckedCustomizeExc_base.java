package Day13_exceptionalHandeling;

public class CheckedCustomizeExc_base {

	public static void main(String[] args) {
		
		String empName = "Utkarsh";
		int empAge = 11;
		try {	
			if(empName.equalsIgnoreCase("Utkarsh")) {
				throw new unCheckedException();
				
			}
			else {
				System.out.println("Not matching");
			}
		}
		catch(unCheckedException ch) {
			System.out.println(ch.toString());
		}
		
		System.out.println("=======================");
		
		try {
			if(empAge < 18) {
				throw new unCheckedException(empAge);
			}
			else {
				System.out.println("Eligible for joining ..");
			}
		}
		catch(unCheckedException un ) {
			System.out.println(un.toString());
		}
	}

}


class unCheckedException extends RuntimeException{
	
	unCheckedException(){
		System.out.println("Name is not matching");
	}
	
	unCheckedException(int a){
		System.out.println("Under age Employee ..");
	}
}

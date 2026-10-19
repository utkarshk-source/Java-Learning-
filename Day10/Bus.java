package Day10;

public class Bus extends Vehicle {

		Bus(){
			     //automatically add super(); constructor calling 
			System.out.println("INside Bus (child ) constructor ");
		}
	
	
	
	public static void main(String[] args) {
		
		Bus b= new Bus();

	}

}

class Vehicle{
	
	Vehicle(){
		System.out.println("Inside Vehical constructor..");
	}
	
}

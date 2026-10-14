package Day8;

public class Cars {

	int tiers;
	String colour ;
	int enginePower;
	String company; 
	
	public Cars(int i, String string, int j, String string2) {
		this.tiers =  i;
		this.colour = string;
		this.enginePower = j;
		this.company = string2;
	}

	
	public void carDetails() {
		System.out.println("Car Tiers : "+tiers);
		System.out.println("colour :"+colour);
		System.out.println("Engine CC power : "+enginePower);
		System.out.println("Company : "+company);
	}
	
	public static void main(String[] args) {
		
		Cars c1 = new Cars(4, "Dark Black", 1200, "Tata Motors");
		Cars c2 = new Cars(7, "White", 2700, "Toyota ");
		c1.carDetails();
		System.out.println();
		c2.carDetails();
		
		

	}

}

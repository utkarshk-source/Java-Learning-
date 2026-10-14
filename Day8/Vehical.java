package Day8;

public class Vehical {

	String company;
	char type;
	int launchYear;
	int seats;
	boolean roofTop;
	
	

	public Vehical(String string, char c, int i, short j, boolean b) {
		this.company =string;
		this.type = c;
		this.launchYear = i;
		this.seats = j;
		this.roofTop = b;
	}


	
	public Vehical() {
		System.out.println("Company : "+company);
		System.out.println("Type :"+type);
		System.out.println("Launch Year : "+launchYear);
		System.out.println("Seats : "+seats);
		System.out.println("Rooftop : "+seats);
	}



	public static void carDetails(String c, char t, int y, int s, boolean r) {
		System.out.println("Company : "+c);
		System.out.println("Type :"+t);
		System.out.println("Launch Year : "+y);
		System.out.println("Seats : "+s);
		System.out.println("Rooftop : "+r);
	}
	
	
	
	public static void main(String[] args) {
		
		Vehical car = new Vehical();
		Vehical bus = new Vehical("Volvo", 'M', 2015, (short) 22, false);
		
		car.company = "Tata";
		car.type = 'M';
		car.launchYear = 2022;
		car.seats = 7;
		car.roofTop = true;
		
		carDetails(car.company, car.type, car.launchYear, car.seats, car.roofTop);

	}

}

package Day8;

public class Opps_Fundamentals {
	
	byte age;	
	String name;
	int rollNumber;   // Instance variables belong to individual objects,

	static void details(byte a, String n, int r) {
		
		System.out.println(a+" "+n+" "+r);
	}
	
	public static void main(String[] args) {
		
		Opps_Fundamentals o = new Opps_Fundamentals();
		o.age = 10;
		o.name = "aatharv";
		o.rollNumber = 11125;
		
		details( o.age,o.name, o.rollNumber);
		
	}

}

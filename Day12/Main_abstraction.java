package Day12;


public class Main_abstraction {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();
	}

}

abstract class Vehicle1{
	
	Vehicle(){
		System.out.println("Inside Vehicle constructor ..");
	}
	
	abstract void start();
	
}

class Car extends Vehicle1{
	
	void start() {
		System.out.println("Car starts with keys.");
	}
}

class Scooter extends Vehicle{
	
	void start() {
		System.out.println("Scooter starts with kick.");
	}
}




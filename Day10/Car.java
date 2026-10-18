package Day10;

public class Car extends Vehical {
	int engine = 0;
	
	void parts(int engine ) {
		
		System.out.println(engine);
		System.out.println(this.engine);
		System.out.println(super.engine);
		
	}
	public static void main(String [] args) {
		
		Car c = new Car();
		c.parts(11);
	}
}

class Vehical{
	int engine = 1;
}


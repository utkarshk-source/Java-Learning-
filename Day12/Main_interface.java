package Day12;
import java.io.*;



interface Vehicle1 {
	
	void changeGear(int a); //abstract methods
	void speedUp(int a );
	void applyBreaks(int a);
}

class Bike implements Vehicle1{
	
	int speed;
	int gear;
	
	
	@Override	
	public void changeGear(int gearInp) {
		gear = gearInp;
	}
	
	@Override	
	public void speedUp(int speedInp) {
		speed = speed + speedInp;
	}
	
    @Override
	public void applyBreaks(int speedInp) {
		speed = speed * speedInp;
	}
	
	public void display() {
		System.out.println("Speed : "+speed+ " gear : "+gear );
	}
}

class Bycicle implements Vehicle1{
	int speed;
	int gear;
	
	public void changeGear(int gearInp) {
		gear = gearInp;
	}
	
	public void speedUp(int speedInp) {
		speed = speed + speedInp;
	}
	
	public void applyBreaks(int speedInp) {
		speed = speed * speedInp;
	}
	
	void display() {
		System.out.println("Speed : "+speed+ " gear : "+gear );
	}
}

public class Main_interface {

	public static void main(String[] args) {
		
		Bike  b = new Bike();
		
		b.changeGear(3);
		b.speedUp(2);
		b.applyBreaks(1);	
		
		b.display();
	}

}

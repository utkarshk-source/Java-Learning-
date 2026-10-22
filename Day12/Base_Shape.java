package Day12;

abstract class Shape{
	
	double pi = 3.14;
	double area;
	
	abstract void area();
}

class Circle extends Shape{

	double r;
	Circle(double r){
		this.r = r;
	}
	
	

	//abstract method
	void area() {
		
		 area = pi * r * r;

	}
	void display() {
		System.out.println("Area of Circle : "+area);
	}
}





class Rectangle extends Shape{
	double length;
	double width;
	
	
	Rectangle (double length, double  width) {
		this.length = length; 
		this.width = width;
	}
	
	public void area() {
		area =  length * width;		
	}
	
	 public void display() {
		 System.out.println("Area of Rectangle : "+area);
	 }
	
}


public class Base_Shape {

	public static void main(String[] args) {
		

		Circle s = new Circle(5);
		
		s.area();
		s.display();
		
		System.out.println("===========================");
		
		Rectangle rec = new Rectangle(11.0, 11.);
		rec.area();
		rec.display();
	}
}

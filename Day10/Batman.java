package Day10;
import java.util.Scanner;



class Superhero {  
	
	public  String fly() {
		return "Can fly !! ";
	}      
	
}

class Ironman extends Superhero{
	
	Ironman() {
		System.out.println("Ironman can : "+fly());
	}
}


class Batman extends Superhero  {    //Batman is a Superhero  (batman Is - a superhero Tightly couplled)

	public static void main(String[] args) {
		
		Batman b = new Batman();
		System.out.println("Batman can : "+b.fly());
		
		Ironman i = new Ironman();     // Association(has-a) type relationship 
	}
	
}




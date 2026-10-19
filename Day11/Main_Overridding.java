package Day11;
import java.util.Scanner;
class Payment{
	
	void pay() {
		System.out.println("**Payment has been made**");
		System.out.println("*******************");
	}
}

class UPIPayment extends Payment{
	@Override 
	
	void pay() {
		super.pay();
		System.out.println("Payment made through UPI.");
		System.out.println("*******************");
	}
}

class CardPayment extends Payment{
	
	@Override 
	void pay() {
		super.pay();
		System.out.println("Payment made through Card.");
		System.out.println("*******************");
	}
}

class CashPayment extends Payment{
	@Override 
	void pay() {
		super.pay();
		System.out.println("Payment made through Cash.");
		System.out.println("*******************");
	}
}

public class Main_Overridding {
	
	public static void main(String[] args) {
	
		System.out.println("1.Payment made through UPI. ");
		System.out.println("2. Payment made through Card.");
		System.out.println("3. Payment made through Cash");
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter payment number : ");
		int num = sc.nextInt();
		System.out.println();
		
		Payment p = new UPIPayment();
		Payment p1 = new CardPayment();
		Payment p2 = new CashPayment();
		
		switch(num)
		{
		case 1:
			p.pay();
			break;
		case 2: 
			p1.pay();
			break;
		case 3:
			p2.pay();
			break;
		default:
			System.out.println("Incorrect Input");
			break;
		
		}
		
		
		
	}

}



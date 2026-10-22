package Day12;

interface Payment{
	
	public abstract void pay(double amount);
	
}

class UPIPayment implements Payment{
	
	public void pay(double amount) {
		
		System.out.println("₹"+amount+" using UPI ");
	}
	
	
	
}

class CardPayment implements Payment{
	
	public void pay(double amount) {
		
		System.out.println("₹"+amount+" using Card ");
	}
}

class CashPayment implements Payment{
	public void pay(double amount) {
		
		System.out.println("₹"+amount+" using Cash ");
	}
}

public class Base_payment {

	public static void main(String[] args) {
		
		UPIPayment u = new UPIPayment();
		CardPayment c = new CardPayment();
		CashPayment cash = new CashPayment();
		
		
		u.pay(600);
		
		System.out.println("===============");
		
		c.pay(100);
		
		System.out.println("===============");
		
		cash.pay(1200);


	}

}

package Day9;

public class FinalDemo extends Test{

	void m1() {
		System.out.println("Inside the FinalDemo class method!! ");
	}
	
	public static void main(String [] args) {
		Test t = new Test();
		t.m1();
		
		FinalDemo f = new FinalDemo();
		f.m1();
	}
}
final class Test{
	
	void m1() {
		System.out.println("Inside the test class method!! ");
	}
}
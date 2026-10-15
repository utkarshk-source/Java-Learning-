package Day9;

public class StaticDemo {

	static String cal = "Calcultor for Subtraction!";
	
	public static void main(String[] args) {
	
		
		
		int result = Calculator.sub(12, 11);
		
		System.out.println(result);
		
	}

}

class Calculator{
	
	static int sub(int a , int b) {
		System.out.println(StaticDemo.cal);  // class name.staticVariale
		return a - b;
	}
}
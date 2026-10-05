package Day5;

public class Factorial_recursion {

	static int fact = 1;     // no need for an static variable
	
	public static void main(String[] args) {
		
			int  n = 5;
			
			Factorial_recursion ob = new Factorial_recursion();
			
			ob.calFact(n);     // int fact = ob.calFact(n);
			System.out.print("The factorial of "+n+" is "+fact);
	}

	 void calFact(int x){           // int void calFact(int x)
		
		if(x >= 1) {
		
			fact = fact * x;
			
			calFact(x -1 );    //return x * calFact(x - 1);
		}
		}
		
	}


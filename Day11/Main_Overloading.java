package Day11;

public class Main_Overloading {

	
	int  add(int a, int b) {
		return a+b;
	}
	
	 double add(int a, int b , double c) {
		return a + b +c;
	}
	
	 double  add (int a, float b, int c ) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		Main_Overloading m = new Main_Overloading();
		
		
		double temp =m.add(11 , 24.4f, 55);
		
		System.out.println(temp);
		
		System.out.println(m.add(11 , 12 , 13.00));
		

		int aa = m.add(12 , 12);
		System.out.println(aa);
	}

}

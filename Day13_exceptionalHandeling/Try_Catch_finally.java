package Day13_exceptionalHandeling;

public class Try_Catch_finally {

	public static void main(String[] args) {
		int a =10, b = 0, c;
		try {
			
			c = a/b;
			System.out.println(c);
		}
		catch(Exception e ) {
			b = 1;
			c = a/b;
			System.out.println(c);
			System.out.println(e.getMessage());
			System.out.println("============");
		}
		finally {
			
			try {
				b =0;
				c = a/b;
				System.out.println(c);
			}
			catch(Exception e ) {
				b = 2;
				c = a/b;
				System.out.println(c);
				System.out.println(e.toString());
			}
			catch(ArithmeticException ae ) {
				System.out.println();
			}
			finally {
				System.out.println("============");
			}
			System.out.println("Exception is occured in try block");
		}

	}

}

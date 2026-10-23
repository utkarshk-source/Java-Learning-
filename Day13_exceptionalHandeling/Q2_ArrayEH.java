package Day13_exceptionalHandeling;
import java.util.Scanner;
public class Q2_ArrayEH {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index : ");
		int index = sc.nextInt();
		
		ArrayClass a = new ArrayClass(index);
		
		
		int len = a.len();
		
		try {
			if (index > len) {
				
				throw new Arrayndex();
				
			}
			else {
				System.out.println(a.get());
			}
		}
		catch(Exception e ) {
			
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}

class ArrayClass{
	int[] arr = new int[] {10 , 20, 43, 88, 56};
	int index;
	ArrayClass(int index  ){
		
		this.index = index;
	}
	
	int len() {
		return arr.length;
	}
	
	int get() {
		return arr[index];
	}
	
}

class Arrayndex extends RuntimeException{
	
	Arrayndex(){
		
		System.out.println(" Array out of Index ");
	}
}



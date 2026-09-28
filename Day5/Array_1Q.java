// (Easy) Create an integer array of size 10 and fill it with the first 10 multiples of 3. Print it.



package Day5;

public class Array_1Q {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 0 ; i < num.length ; i++) {
			
			num[i] = 3 * (i +1);
			
		}System.out.println(" the 10 number of the 3 divisi");
				
		for(int j =0 ; j < num.length; j++) {
			System.out.println(num[j]);
		}
    	}

		
	}



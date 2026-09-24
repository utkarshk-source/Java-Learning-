package Day_learnings;
import java.util.Scanner;

public class Do_while_loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number for table : ");
		int num = sc.nextInt();
		
		int i = 0;
		
		do {
			System.out.println(i * num);
			i++;
		}
		while(i <= 10);
	}

}

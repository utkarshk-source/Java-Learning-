package Day_learnings;
import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the number for table : ");
	int num = sc.nextInt();
	int i = 1;
	while(i <= 10) {
		System.out.println(i * num);
		i++;
		}
	}

}

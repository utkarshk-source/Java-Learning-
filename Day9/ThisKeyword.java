package Day9;
import java.util.*;
public class ThisKeyword {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter Number: ");

		int num = sc.nextInt();
		System.out.println();
		
		EncapsulaitonDemo en = new EncapsulaitonDemo();
		en.setMethod(name, num);
		System.out.println(en.getMethod());
		System.out.println("Number : "+en.getMethod1());
		
	}

}

class EncapsulaitonDemo{
	
	private String name;
	private int number;
	
	// Setter method is used to set or modify the data
	public void setMethod(String name, int number) {
		
		this.name = name;
		this.number = number;
	}
	
	// Getter method used to get the data
	public String getMethod() {
		return "Name : "+name;
	}
	
	public int getMethod1() {
		return number;
	}
	
}

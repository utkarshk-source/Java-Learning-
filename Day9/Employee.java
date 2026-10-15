package Day9;

import java.util.Scanner;

public class Employee {

	String employeeName ;
	private double salary ;
	
	static String companyName =  "Zensar Tech";
	static int objectCount = 0;

	final float tax_rate = 0.10f;
	
	Employee(String name, double salary){
		
		this.employeeName = name;  // inititaliging name 
		
		if(salary >=0) {
			this.salary = salary;
		}
		else {
			this.salary = 0;
			System.out.println("Invalid salary. Set to 0.");
		}
		
		objectCount++;
	}
	
	
	public void setSalary(double salary) {
		
		if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated successfully");
        } else {
            System.out.println("Invalid salary");
        }
    }
	
	
	public double getSalary() {
		
		return this.salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee name : "+this.employeeName);
		System.out.println("Employee salary :"+this.salary);
		System.out.println("Company name : "+Employee.companyName);
		System.out.println("Fixed tax rate : "+(tax_rate)*100+"%");
		System.out.println();
		
		
	}
	
	public static void displayObjectCount() {
		
		System.out.println("Total Objects Created: " + objectCount);
	}
	
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter Name : ");
//		String name = sc.nextLine();
//		
//		System.out.print("Enter Salary : ");
//		double salary = sc.nextDouble();
//		System.out.println();
		
		Employee ep = new Employee("Rahul" , 60000);
		
		ep.displayDetails();
		
		 System.out.println();
		
		// Update salary with a valid value
		ep.setSalary(-5000.00);
		 System.out.println();
		
		 System.out.println("Rahul's Salary : "+ep.getSalary());
		 System.out.println("Company Name : "+Employee.companyName);
		 ep.displayObjectCount();
		 
		  // Demonstrate final tax rate
		 System.out.println("Fixed Tax Rate: "+(ep.tax_rate*100) + "%");
		
		
		
	}
}


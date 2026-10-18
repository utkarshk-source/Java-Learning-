package Day10;
  
public class Employee {    // Parent class 

	protected String name ;
	protected int id;


	public Employee(String name , int id) {  //first this constructor calls 
		this.name = name;
		this.id = id;
		System.out.println("Employee constructor called");
		
		
		
	}
	
	void work() {
		System.out.println(name+" is wokring..");
	}

	public static void main(String [] args ) {   //main method 
		
		
		Developer developer = new Developer("Rahul", 101);
		Manager manager = new Manager("Nandini", 2001);
		Tester tester = new Tester("Neelkant", 4002);
		
		System.out.println();
	
		 developer.work();
		 manager.work();
		 tester.work();
		 
	}
}

class Developer extends Employee{
	
	
	public Developer(String name, int id) {
		super(name, id);
		System.out.println("Inside developer constructor");
		 
	}

	 @Override
	void work() {
		 System.out.println(name+" id - "+id+" is working as a Developer.");
	}
	
}

class Manager extends Employee{
	
	
	
	public Manager(String name, int id) {
		super(name, id);
		System.out.println("Inside Manager constructor..");
			}

	 @Override
		void work() {
			 System.out.println(name+" id - "+id+" is working as a Mange.");
		}
	
}

class Tester extends Employee{
	
	
	
	public Tester(String name, int id) {
		super(name, id);
		System.out.println("Inside testing constructor ");
		
	}

	 @Override
		void work() {
			 System.out.println(name+" id - "+id+" is working as a Tester.");
		}
	
	
}
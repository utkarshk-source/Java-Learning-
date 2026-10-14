package Day8;

public class Employee_cons {

	int emp_id;
	String name;
	String department;
	double salary;
	
	
	public Employee_cons(int i, String name, String dept, double sal) {
		
		this.emp_id = i;
		this.name = name;
		this.department = dept;
		this.salary = sal;
	}
	public void empDetails() {
		System.out.println("Employee Id: "+emp_id);
		System.out.println("Employee Name : "+name);
		System.out.println("Department name : "+department);
		System.out.println("Salary : "+salary);
	}
	
	Employee_cons(Employee_cons obj){
		this.emp_id = obj.emp_id;
		this.name = obj.name;
		this.department = obj.department;
		this.salary = obj.salary;
		
	}

	public static void main(String[] args) {
		
		Employee_cons emp = new Employee_cons(1001, "Utkarsh", "IT Services", 150000.00);
		emp.empDetails();
		
		Employee_cons emp1 = new Employee_cons(emp);
		
		 System.out.println(
		            "Copy Constructor used Second Object");
		 System.out.println("Employee Id: "+emp1.emp_id);

	}

}

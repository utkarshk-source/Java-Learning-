package StudentResultManagementSystem;
import java.util.Scanner;
public class StudentResultManagementSystem {
	
	static String studentName;
	 int rollNumber;
	 int javaMarks;
	 int sqlMarks;
	 int htmlMarks;
	 int cssMarks;
	 int javaScriptMarks;
	
	public static int total(int java, int s, int h, int c, int j) {
		 return (java + s + h + c + j);
		 
	}
	public static float percentage(float t) {
		return (t / 500) * 100 ;
	}
	
	public void grade() {}
	
	public void result() {}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentResultManagementSystem s = new StudentResultManagementSystem();
		
		System.out.print("Student Name : ");
		s.studentName = sc.nextLine();
		
		System.out.print("Roll Number : ");
		s.rollNumber = sc.nextInt();

		System.out.print("Marks in Java : ");
		s.javaMarks = sc.nextInt();
		
		System.out.print("Marks in SQL : ");
		s.sqlMarks = sc.nextInt();
		
		System.out.print("Marks in HTML : ");
		s.htmlMarks = sc.nextInt();
		
		System.out.print("Marks in CSS : ");
		s.cssMarks = sc.nextInt();
		
		System.out.print("Marks in JavaScript : ");
		s.javaScriptMarks = sc.nextInt();
		
		int totalMarks = total( s.javaMarks, s.sqlMarks, s.htmlMarks, s.cssMarks, s.javaScriptMarks );
		System.out.println("Total : "+totalMarks);
		 
		float totalTemp = (float)totalMarks;
		
		float percent = percentage(totalTemp);
		System.out.println("Percentage : "+percent+"%");
	}

}

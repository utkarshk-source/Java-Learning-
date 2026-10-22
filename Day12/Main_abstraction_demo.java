package Day12;

abstract class Party {
	
	String headOffice;
	int noOfState;
	
	Party(String headOffice, int noOfState){
		
		this.headOffice = headOffice;
		this.noOfState = noOfState;
	}
	
	abstract void memberNumber();
	
}

class Bjp  extends Party{
	
	Bjp(String headOffice, int noOfState){
		super(headOffice, noOfState);
	}
	
	public void memberNumber() {
		System.out.println("Party : BJP");
		System.out.println("Head of Office : "+headOffice);
		System.out.println("Number of State BJP operates : "+noOfState);
	}
		
}


class Congress  extends Party{
	
	Congress(String headOffice, int noOfState){
		super(headOffice, noOfState);
	}
	
	public void memberNumber() {
		System.out.println("Party : Congress");
		System.out.println("Head of Office : "+headOffice);
		System.out.println("Number of State Congress operates : "+noOfState);
	}
}

class AAP  extends Party{
	AAP(String headOffice, int noOfState){
		super(headOffice, noOfState);
	}
	public void memberNumber() {
		System.out.println("Party : AAP");
		System.out.println("Head of Office : "+headOffice);
		System.out.println("Number of State AAP operates : "+noOfState);
	}
	
}




public class Main_abstraction_demo {

	public static void main(String[] args) {
		
		Party p1 = new Bjp("Amit Shah", 29);
		Party p2 = new Congress("Rahul Ghandi", 24);
		Party p3 = new AAP("Sanjay Singh", 4);
		
		p1.memberNumber();
		System.out.println();
		p2.memberNumber();
		System.out.println();
		p3.memberNumber();

	}

}

/* ----1st program--

class Demo
{ 
   public static void main(String[]args ){
	
	System.out.println( 50/3);
	System.out.println( 50/3);


	}
}


====================================================


class DataTypesExample {
    static int staticVar = 50;  // Static variable

    public static void main(String[] args) {
        int age = 25;                    // Local variable (primitive)
        double salary = 55000.75;        // Primitive
        String name = "Java Developer";  // Reference type

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Name: " + name);
        System.out.println("Static Var: " + staticVar);
    }
}
=======================================================


 class Demo {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("Integer: " + num);

        double d = num; // int -> double (automatic)
        System.out.println("Double: " + d);
    }
}

type casting :
============
1. Widening Conversion Practice

Task:

Declare an int variable with value 150.

Assign it to a double variable without explicit casting.

Print both values and check the result.

Solition:


class demo{

	public static void main(String [] args){
   
	int num = 10;
        System.out.println("Integer : " +num);
     
        double d = num;
        System.out.println("Decimal: "+d);
    }
}
---------------------------------------------------------
🧠 2. Narrowing Conversion Practice

Task:

Declare a double variable with value 99.99.

Convert it to an int using explicit casting.

Print both values and observe the precision loss.

Solution: 


class Demo{

	public static void main(String [] args){

	double pi = 3.14159265359;
	System.out.println("Double pi : " +pi);
       
        int pie = (int)pi;
        System.out.println("Integer pi : " +pie);
   }
}
-------------------------------------------------
Character to Integer Conversion

Task:

Declare a char variable with value 'A'.

Convert it to its ASCII integer value.

Print both the character and integer.

Hint: Use explicit casting: (int) myChar.

Solution: 
class Demo{

	public static void main(String [] args){

	char name = 'a';
	System.out.println("Char Name : " +name);
       
        int ascii_name = (int)name;
        System.out.println("Integer Name : " +ascii_name);
   }
}
--------------------------------------------------------------

4. Arithmetic with Mixed Types

Task:

Declare two variables: int a = 7; and double b = 2.5;.

Perform division: a / b.

Store the result in a double and print it.

Cast the result back to an int and print again.

Solution:


class Demo{

	public static void main(String [] args){

	int a = 7;
	double b = 2.5;
	double c = a/b;

	System.out.println("Double Result : " +c);
        System.out.println("Integer Result : "+(int)c);
       
   }
}
--------=================================================
Operators in java:

Arithematic operators:
---------------------



class Demo{

public static void main(String [] args){

int a = 100, b=33;

System.out.println(a%b);

   }
}

----------------------------------------------------------------

Assigment Operater:
--------------------


class demo{

public static void main(String [] args){
   
  int a = 20, b = 10, c=1;
   c %= a;
  System.out.println(c);

   }
} 
----------------------------------------------------------------

Relational(Comparision) Operater:
---------------------------------

class demo{

public static void main(String [] args){

int a = 10, b =20;
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);

   }
}

----------------------------------------------------------------
Logical Operator:
-----------------


class demo{
  public static void main(String [] args){

   System.out.println((5 > 3 )&& (3>=3));
   System.out.println(!(3>=3));

  }
}


------------------------------------------------------------------


*/









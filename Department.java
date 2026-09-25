/*
Loops in java:\
==============

While loop:
-----------

Example=

class Demo{
 public static void main(String [] args){
  
  int num = 0;
  while(num <=10){
    System.out.println(num*2);
    num++;
  }
  System.out.println("Ouside the loop!!");
 
  }
}

================================================================

Do...While loop:
----------------

class Demo{
  public static void main(String [] args){
  int i =0;
  do {
     System.out.println("Inside the loop time : "+i); 
     i++;
   }while(i<10);
  
  System.out.println("Ouside the loop!!");

  }

}

================================================================

practie:
---------

2️⃣ Sum of Natural Numbers

Ask the user for a number n.

Use a while loop to find and print the sum of numbers from 1 to n.


class demo {
  public static void main(String []args){
  
  int in = 10;
  int num= 0, result= 0;
  while(result <= in){

    num = num + result;
    result++;

    }
 System.out.println("Sum of natural number till : " +num);

  } 
}
-----------------------------------------------------------------
Multiplication Table

Take an integer input.

Print its multiplication table (1–10) using a for loop.

Solution:
-----------
class Demo{
  public static void main(String [] args){

    int num = 6;
     for(int i = 1; i <=10; i++){
          
        System.out.println(num+" * " +i+" = "+(num*i));
      }
  }
}

-----------------------------------------------------------------
4️⃣ Reverse Countdown

Use a for loop to count backward from 20 to 1.


Solution:
-----------
class demo{
 public static void main(String [] args){
   
  for(int i = 20; i >0;i--){
   System.out.println(i);

  }
 }

}
-----------------------------------------------------------------
5️⃣ Even Numbers Between Two Numbers

Input two numbers.

Use a while loop to print all even numbers between them.

solution:

class Demo{
  public static void main(String [] args){

   int num1 = 9, num2 = 20;

   for (int i = num1; i <= num2; i++ ){
     
    if (i%2 == 0){
      System.out.println(i);
      }

  } }
}


-----------------------------------------------------------------
6️⃣ Factorial of a Number

Take an integer input.

Use a for loop to compute its factorial (e.g., 5! = 120).

Solution:

class Demo{
  public static void main(String [] args){
 
   int num = 6, fact = 1;
   for(int i = 1; i <= 6; i++){
    fact *=i;                        // fact = fact * i
    
    }
   System.out.println("Factorial of "+num+" is "+fact );
  }

}

-----------------------------------------------------------------

7️⃣ Sum of Digits

Ask for a number.

Use a while loop to find the sum of its digits (e.g., 123 → 6).

solution:

class Demo{
 public static void main(String [] args){
    int num = 444, result = 0;
    while(num != 0){
     int temp = 0;
      temp = num%10;
       num = num/10;
      result = result + temp;
        }

   System.out.println(result);
   
  } 

}

-----------------------------------------------------------------


8️⃣ Palindrome Number Checker

Input a number.

Use loops to reverse it and check if it’s a palindrome (e.g., 121 → Palindrome).

Solution:


class Demo{
 public static void main(String [] args){
   
  int num = 121, temp= 0, result = 0;
  for (; num != 0; num /= 10){
    temp = num%10;
    System.out.println(temp);

    result = temp + (result*10);
     // System.out.println(result);

  }

 }
}

________________________________________________________________

Object Oriented programing;

class Table{

 public void table2(){
  
   int num = 2;
    for(int i = 1; i<= 10; i++){
    
     System.out.println(num * i);}
  
  }

  public void table3(){
  
   int num = 3;
    for(int i = 1; i<= 10; i++){
    
     System.out.println(num * i);}
  
  }

 
 public static void main(String [] args ){
 
   System.out.println("Table of 2 :");
    Table count1 = new Table();
     count1.table2();
   System.out.println("Table of 2 :");
     count1.table3();

  }


}
===============================================================================

class Animal{

	String color;
   	int age;
	public static void main(String [] args){
       
 	Animal pugg = new Animal();
   	pugg.color = "White And Black";
  	pugg.age = 2;
	System.out.println(pugg.color+ " & "+pugg.age);

        

  	
}



}

===============================================================================


class Animal{

	String color;
	int age;
	void initObj(String a , int b){
	
	color = a;
	age = b;
	System.out.println("Method initObj is called...");


       }
	void display(){
	System.out.println("Method display is called....");

	System.out.println(color+" - "+age);
    	}

	public static void main(String [] args){

	Animal pugg = new  Animal();
	System.out.println("Object initialized");
	pugg.initObj("White and black", 10);

	pugg.display();
	}



}


===============================================================================

Constructor:
===========


class Animal{

 Animal(){

  System.out.println("Inside the Constructor.");
  }

 public static void main(String [] args){
     System.out.println("Inside the main method.");
     Animal pugg = new Animal();
       System.out.println("Object created.");


  }


}

================================================================

class India {

India(String pm){

String nm = pm;
System.out.println("Mr. "+nm+" is the Prime Minister of India since 2014 ");
}

	public static void main(String [] args){

	India in = new India("Narendra modi");

	}	


}


================================================================


class Product{

int prod;
String name;
double price;
String quality;

Product(int productId, String name, double price, String quality ){
 
this.prod = productId;
this.name = name;
this.price = price;
this.quality = quality;

}


void display(){
 
System.out.println("Product id: "+prod);
System.out.println("Product name: "+name);
System.out.println("Product Price: "+price);
System.out.println("Product Quality: "+quality);

System.out.println("***************************************");


}

public static void main(String [] args){


Product pd = new Product(1001,"Shoes", 1799.99, "Good");
Product pd1 = new Product(1002,"Tie", 999.99, "Excellent");

pd.display();
pd1.display();
}

}



================================================================

Inheritance:
============

Single inherirace:
-------------------

class Animal{
	void eat(){

	System.out.println("inside Eat method ");

  	}
	Animal(){
	System.out.println("Inside eyes constructure..");
	}

}

class Dog extends Animal{
 
	public static void main(String [] args){
	
	Dog d = new Dog();
 	d.eat();
	}

}


2. Multilevel inheritace:
========================

class Company{

	void company_name(){
	System.out.println("Company name is Utkarsh Pvt. lmt. ");
	}

}

class Department extends Company{
	void department_name(){

	System.out.println("Goods and Services..");
	}

	public static void main(String [] args){
 	Department d = new Department();
	
	d.company_name();
	d.department_name();
//	d.employee_num();
	}

}

class Employee extends Department{
	
	void employee_num(){
  	System.out.println("Employees numbers are 500+");
	}

	public static void main(String [] args){
	
	Employee e = new Employee();
        e.company_name();
	e.department_name();
	e.employee_num(); }

}

================================================================
*/


class Computer{
  
 pubic String keybord(int num){

   if(num >= 104){
 
	return "Keybord has 104 keys";
    }
   else{
      return "Please enter a valid input!!";
   }

  }


 public void  cpu(){
  
   System.out.println("Inside CPU method...");
  
  }

}

class Test{

  public static void main(String [] args){
  
	Computer con = new Computer();

       	con.cpu();
	String str = con.keybord(103);
	System.out.println(str);
   }


}












































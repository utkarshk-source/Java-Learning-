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
*/

public class Table{

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






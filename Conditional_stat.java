/*
if-else:
--------
1. Positive, Negative, or Zero

Task:

Read an integer from the user.

Print whether it’s positive, negative, or zero using an if-else ladder.

solution:
---------


class demo{
 public static void main(String []args){

   int num = -101;
   if(num > 0){
    System.out.println("Num "+num+" is Positive.");
   }else{
      System.out.println("NNumber is Negative");
      }


  }


--------------------------------------------------------
Take an integer as input.

Use if-else to check if the number is even or odd.

Solution:
---------

class Demo{

 public static void main(String []args){
  int num = -44;
   if(num > 0){
     if(num%2 == 0){
        System.out.println("Number is positive and even!");
       } else{
         System.out.println("Number is postive and Odd");
         }
   }else{
      System.out.println("NUmber is negative");
   }
   } 
  
}

----------------------------------------------------------
3. Largest of Two Numbers

Task:

Read two integers.

Use if-else to print which number is larger (or if they are equal).

Solution:
---------

class Demo{

 public static void main(String []args){
     
   int num1 = 13, num2 = 10;

   if(num1 > num2){
     System.out.println("Number "+num1+" is greater than "+num2);
     }
   else if(num1 < num2){
      System.out.println("Number "+num2+" is greater then "+num1);
   
   }
   else {
     System.out.println("Both number are equal.");
    }

   }

}

----------------------------------------------------------------------
----------------------------------------------------------------------

Switch Statment:
---------------

1. Day of the Week

Task:

Take an integer (1–7) as input.

Print the corresponding day name (1 → Monday, …, 7 → Sunday).

Use default for invalid input.

Solution:
--------

*/

class Demo{
 
  public static void main(String [] args){

  int day = 8;

  switch(day){
  
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Satday");
    break;
  case 7:
    System.out.println("Sunday"); 
    break;

   default:
    System.out.println("Enter a number between 1-7");
    }
  }
}

























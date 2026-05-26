// Max of 3 numbers
package Day1;
import java.util.*;
public class max_of_3nos
{
  public static void main(String[] args)
  {
    int a=10;
    int b=5;
    int c=11;
    
    if(a>b)
    {
      if(a>c)
      {
        System.out.println(a);
      }
      else{
        System.out.println(c);
      }
    }
    else
    {
      if(b>c){
          System.out.println(b);
      }
      else{
           System.out.println(c);
      }
    }
  }   
}

/*
PSEUDO CODE
1.start
2.input a,b,c
3.if a>b do
     if a>c do
       print a
     else
      print c
  else
    if b>c do
      print b
    else 
      print c

4.exit
*/

// /* -----YouTube Java &DSA in 30 day full coure ------


// -------- Part-1 ----------(24-05-2026)


// FUNCTION
//  > The code what erver we thought to write we will write in fun
//  > Fun will be written in class
//  > So in java which is named as "main" which will be the first part of execution 
//    > so what ever we woret in the "main fun" will be executed 1st

// CLASS
//  > Class means a hug entity where we can have many functions
//    > where one fun is working on something and anothere fun on anothere work 

// --------- Part-2 ------------


// 1.Output
// syso();/System.out.println()
// system-class  
// println-fun
// syso("hello \n")-anothere methode for printing in next line

// Qs : Print the pattern
// *
// **
// ***
// ****
// sol:
// syso("*\n**\n***\n****")

// 2.Variables

// 3.Data types :
// Java is typed language
// Typed language means we have to say the variable type like
//  >Primitive: pre defined which are not able to customize
//    > int   > float(f)   > double  > short
//    > byte  > boolean    > char    > long
// >Non-Primitive: can be able to customize, we can create
//    > String   >Array    > Class
//    > Object   >Interface 

// Qs: a*b/a-b
// a=10  b=5   //(ans=10*5/10-5=50/5=10)
//   sol:
//   int ans=(a*b)/(a-b);
//     System.out.println(ans);  //o/p:10
  
// 4.Input
// import java.util.*; //it is a package where there will be some code 
// Scanner sc = new Scanner(System.in); // here we have imported scanner class for the above package
// // "System.in" is used to take input
// String name=sc.next(); 
// //here "next()" is a fun
// // here next() fun will take singe token for 
// // ex: if we give single word the it will display single word 
// //      > if we give multiple words then it take first word only 
// //   > here if we want full sentence or multiple words we use "nextLine()" fun
// String name=sc.nextLine(); 
//  > nextInt()
//  > nextFloat()
 
//  Qs : Take 2 variables 'a' & 'b' and print there sum.
//  sol:
//  Scanner Sc = new Scanner(System.in);
//     int a= Sc.nextInt();
//     int b=Sc.nextInt(); 
//     int sum=a+b;
//     System.out.println("sum of a+b: "+sum); 
//  */

/*
----------Part-3------------  25-05-2026
Conditional statements
if(cond){
}
else{
  }

26-05-20266
Qs: take 2 inputs from user and satisfie the following con:
1.a=b equal
2.a>b a greater than b
3.a<b a lesser than b
sol:
int a=sc.nextInt();
        System.out.print("Enter B: ");
        int b=sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                    System.out.println("A is greater than B");
                }
            else{
                System.out.println("A is less than B");
            }

-- else-if cond --
if(con)
{  }// if this cond is true the it does not goes to else if cond 
    // if it is false then it goes to "else if"
else if(con)
  {  }// if it is true the it does not goes to else
else{   }


*/
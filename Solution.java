
/*{
    public static void main(String[]args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input an integer: ");
    int digits=sc.nextInt();
    System.out.println("The sum is: "+sumDigits(digits));
    }
    public static int sumDigits(int n) 
    {
    int sumOfDigits=0;
    while(n>0) 
    {
    int lastDigit=n%10;
    sumOfDigits+=lastDigit;
    n/=10;
    }
    return sumOfDigits;
    }
}

{
    public static void main(String args[]){
    String names[]={"srikanth","akshay","gopal","karthik"};
    for(int i=0;i<=5;i++){
        System.out.println(names[i]);
    }
    }
}*/

// import java.util.Scanner;
// public class Solution
//  {
//   public static void update(int marks[],int nonchangable){
//      nonchangable=10;
//     for(int i=0;i<marks.length;i++){
//       marks[i]=marks[i]+1;
//     }
//   }
//       public static void main(String[] args, int nonchangable) {
//         int marks[]={97,98,99};
//         int nonchangeable=5;
//         update(marks, nonchangable);
//         for(int i=0;i<marks.length;i++){
//           System.out.print(marks[i]+" ");
//         }
//       System.out.println();
//   }
//       @Override
//       public String toString() {
//         return "Solution []";
//       }
// }
import java.util.*;
public class Solution
 {
  public static void update(int marks[],int nonchangable){
     nonchangable=70;
    for(int i=0;i<marks.length;i++){
      marks[i]=marks[i]+1;
    }
  }
      public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchangeable=0;
        update(marks, nonchangeable);
        System.out.println(nonchangeable);
        for(int i=0;i<marks.length;i++){
          System.out.print(marks[i]+" ");

        }
      System.out.println();
  }
}
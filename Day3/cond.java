package Day3;
import java.util.*;
public class cond 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter A: ");
        // int x=sc.nextInt();
        // if(x%2==0)
        //     {
        //         System.out.println("Even");
        //     }   
        // else{
        //     System.out.println("Odd");
        // }
        int a=sc.nextInt();
        System.out.print("Enter B: ");
        int b=sc.nextInt();

        // if (a==b)
        // {
        //     System.out.println("Equal");
        // }
        // else
        // {
        //     if(a>b)
        //         {
        //             System.out.println("A is greater than B");
        //         }
        //     else{
        //         System.out.println("A is less than B");
        //     }
        // }
        if(a==b){
            System.out.println("a and b are equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }
    }   
}


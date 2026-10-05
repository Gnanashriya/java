package Day3conditional_stms;
import java.util.*;
public class problems {
    public static  void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number A = ");
        int a=sc.nextInt();
        System.out.print("Enter a number B = ");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("B is lessthan that A"+b);
        }
        else if(b>a){
            System.out.println("A is lessthan that B"+a);
        }
        else{
            System.out.println("both are equal");
        }
        sc.close();
    }
}
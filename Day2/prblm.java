package Day2;
import java.util.*;
public class prblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        char n=sc.next().charAt(0);
        // even or odd
        //System.out.println((n%2==0)?"even":"odd");
        if(n%2==0){
            System.out.println("Even");
        } 
        else{
            System.out.println("odd");
        }
        //+ or -
        if (n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        // prime or not prime
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        //Eligible to vote 30/09/2026
        if(n<=18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Eligible to vote");
        }
        //Greater than 10 or not
        if(n>=10){
            System.out.println("Greater than 10");
        }
        else{
            System.out.println("less than 10");
        }
        //Pass or fail
        if(n>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        //Divisible by 5
        if(n%5==0){
            System.out.println("Divisible by 5 ");
        }
        else{
            System.out.println("Not divisible by 5");
        }
        // 0 or non0
        if(n==0){
            System.out.println("It is zero "+ n);
        }else{
            System.out.println("It is not a zero "+n);
        }
        if(Character.isUpperCase(n)){
            System.out.println(n+": Is in upper case");
        }else if(Character.isLowerCase(n)){
            System.out.println(n+": is in lower case");
        }
        else{
            System.out.println(n+": It is not aa string");
        }
    }
}

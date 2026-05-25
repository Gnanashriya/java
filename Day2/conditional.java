package Day2;
import java.util.*;
public class conditional 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        // if else condition
        if(age>18){
                System.out.println("Adult");
            }
        else{
            System.out.println("Teenager");
        }
    }
    
}

package Day4prblms_on_cond;
import java.util.*;
public class calculator {
    public static void main (String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number :");
        int a=sc.nextInt();
        System.out.print("enter second nummber :");
        int b=sc.nextInt();
        
        System.out.println("enter a option");
        System.out.println("1: addition (a+b)");
        System.out.println("2: Scbtraction (a-b)");
        System.out.println("3: Multiplication (a*b)");
        System.out.println("4: Division (a/b)");
        System.out.println("5: Modulo or Remainder (a%b)");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Result = "+(a+b));
                break;
            case 2:
                System.out.println("Result = "+(a-b));
                break;
            case 3:
                System.out.println("Result = "+(a*b));
                break;
            case 4:
                System.out.println("Result = "+(a/b));
                break;
            case 5:
                System.out.println("Result = "+(a%b));
                break;
            default: System.out.println("Invalid input!");
        }
        sc.close();

    }
}

package Day4prblms_on_cond;
import java.util.*;
public class month_prblm {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month number :");
        int month=sc.nextInt();
        switch(month){
            case 1: 
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("There are 12 months only so enter from 1 to 12 only");
            }
        // problem in part 2 video-- 1st problem
        int age=sc.nextInt();
        float percentage=sc.nextFloat();
        char section=sc.next().charAt(0);
        String name=sc.nextLine();
        double temperature=sc.nextDouble();
        boolean result=sc.nextBoolean();
        byte child_age=sc.nextByte();
        }
}



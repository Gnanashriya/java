package Day6_loop;
import java.util.*;
public class prblm {
    public static void main(String args[])
    {
        // sum of natural numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

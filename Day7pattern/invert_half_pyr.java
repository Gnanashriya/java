package Day7pattern;
import java.util.*;
public class invert_half_pyr {
    public static void main (String args[])
    {
        int n=4;
        //self
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//from class
    // for(i=n;i>1;i--){
    //     for(j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
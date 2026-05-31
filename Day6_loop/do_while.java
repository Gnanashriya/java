package Day6_loop;
import java.util.*;
public class do_while {
    public static void main(String args[])
    {
        int i=12;
        while(i<11){
            System.out.println("Hello world");
        } // this will be blank in output
        do{
            System.out.println("Hello world");
            i++; //i=i+1
        }while(i<11);  // this will give output as hello world  
    }

}
// syntax:
// do{
//     //do some thing
// }while(condtion);
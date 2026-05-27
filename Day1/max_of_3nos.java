// Max of 3 numbers
package Day1;
import java.util.*;
public class max_of_3nos
{
  public static void main(String[] args)
  {
    int a=10;
    int b=5;
    int c=11;
    
    if(a>b)
    {
      if(a>c)
      {
        System.out.println(a);
      }
      else{
        System.out.println(c);
      }
    }
    else
    {
      if(b>c){
          System.out.println(b);
      }
      else{
           System.out.println(c);
      }
    }
  }   
}

/*
PSEUDO CODE
1.start
2.input a,b,c
3.if a>b do
     if a>c do
       print a
     else
      print c
  else
    if b>c do
      print b
    else 
      print c

4.exit
*/
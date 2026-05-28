package Java;
/*import java.util.*;
public class javabasics
{
      public static void bintodec(int binNo)
      {
        int pow=0;
        int decNum=0;
                
        while(binNo>0)
        {
          int ld=binNo%10;
          decNum=decNum+(ld * (int)Math.pow(2,pow));
          pow++;
          binNo = binNo/10;
        }
        System.out.println("decimal of "+binNo+"="+decNum);
      } 
      public static void deitobin(int n)
      {
        int myno=n;
        int pow=0;
        int binnum=0;
        while (n>0)
        {
         int rem=n%2;
         binnum=binnum+(rem*(int)Math.pow(10,pow));
         pow++;
         n=n/2; 
        }System.out.println("binyarform of"+myno+"="+binnum);
      }
      public static void main(String args[])
      {
       bintodec(21);
       deitobin(21);
       
      }
}*/

import java.util.*;
public class javabasics {
  public static int getlargest(int numbers[])
  {
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++)
    {
      if(largest < numbers[i])
      {
          largest = numbers[i];
      }
    }
      return largest;
    
  }
    public static void main(String args[])
    {
      int numbers[]={2,3,5,6,7,14,4,11};
      System.out.println("largest value is:" + getlargest(numbers));
    }
  }
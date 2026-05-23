// public class partterns{
//     public static void inverted_rotated_half_pyramid(int n)
//     {
//         //outer loop
//        for(int i=1;i<=n;i++)
//        {
//        //spaces
//        for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//        }  

//        //stars
//        for(int j=1;j<=i;j++){
//         System.out.print("*");
//        }
//        System.out.println();
//     }
//     }
//     public static void main(String args[]){
//     //hollow_rec(6,10);
//     inverted_rotated_half_pyramid(10);
//   }
// }

// public class partterns
// {
//     public static void butterfly(int n)
//         {
//     //     //1st half
//     //     for(int i=1;i<=n;i++)
//     //     {
//     //         //stars-i
//     //         for(int j=1;j<=i;j++){
//     //             System.out.print("*");
//     //         }
//     //         //stars-2*(n-i)
//     //         for(int j=1;j<=2*(n-i);j++){
//     //             System.out.print(" ");
//     //         }
//     //         //stars-i
//     //         for (int j=1;j<=i;j++)
//     //         {
//     //             System.out.print("*");
//     //         }System.out.println();
//     //     }
//     //     //2nd half
//     //     for (int i=n;i>=1;i--){
//     //        //stars-i
//     //         for(int j=1;j<=i;j++){
//             //     System.out.print("*");
//             // }
//             // //stars-2*(n-i)
//             // for(int j=1;j<=2*(n-i);j++){
//             //     System.out.print(" ");
//             // }
//             // //stars-i
//             // for (int j=1;j<=i;j++)
//             // {
//             //     System.out.print("*");
//             // }System.out.println();
//         }
//     }

//     public static void main(String []args)
//     {
//         //inverted_half_pyramid_num(5);
//         //zero_one_triangle(5);
//         //floyds_triangle(5);
//         // butterfly(4);
//     }
// }
// public class partterns 
// {
 import java.util.Scanner;
public class partterns
 {
  public static void update(int marks[],int nonchangable){
     nonchangable=10;
    for(int i=0;i<marks.length;i++){
      marks[i]=marks[i]+1;
    }
  }
      public static void main(String args[]) {
        int marks[]={97,98,99};
        int nonchangeable=5;
        update(marks, nonchangeable);
        System.out.println(nonchangeable);
        for(int i=0;i<marks.length;i++){
          System.out.print(marks[i]+" ");
        }
      System.out.println();
  }
}
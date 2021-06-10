package Practicals;
import java.util.Scanner;

class PrimeNo{
   public static void main(String args[]){
      int n, count = 1, p = 3, i, j;
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter the value of n:");
      n = scanner.nextInt();
      
      if (n>=1){
         System.out.println("First "+n+" prime numbers are:");
         System.out.println(2);
      }

      for (i=2 ; i<=n ;  ){
         for (j=2 ; j<=i-1 ; j++ ){
            if ( p%j == 0 ){
               count = 0;
               break;
            }
         }
         if (count!= 0){
            System.out.println(p);
            i++;
         }
         count = 1;
         p++;
      }         
   }
}
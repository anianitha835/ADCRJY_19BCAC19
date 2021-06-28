import java.util.*;

class EvenAndOdd
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner (System.in);
          int n;
          int evenCount = 0, oddCount = 0;

          System.out.print("Enter an integer: ");
          n= sc.nextInt();

          while (n>0)
          {
        	  if (n%2==0)
               {
                    evenCount++;
               }
               else
               {
                    oddCount++;
               }
               n = n/ 10;
          }
          
          System.out.println("Even: "+evenCount);
          System.out.println("odd: "+oddCount);
     }
}

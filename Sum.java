import java.util.Scanner;

public class Sum
{
   public static void main(String[] args)
   {
      Scanner k = new Scanner(System.in);
      System.out.println("Write the number: ");
      int n = k.nextInt();
      int sum = 0;
      for (int i = 1; i <= n; i++)
         sum = sum + i;
      System.out.println("Sum = " + sum);
      k.close();
   }
}

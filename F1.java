
public class Fibonacci
{
   public static void main(String[] args)
   {
      int n = 10, t1 = 1, t2 = 1;
      System.out.print("First " + n + " terms: ");

      for (int i = 0; i <= n; ++i)
      {
          System.out.println("Fibonacci("+ i + ")="+t1);

          int sum = t1 + t2;
          t1 = t2;
          t2 = sum;
      }
   }
}

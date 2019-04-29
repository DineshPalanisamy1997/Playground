import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     try
      {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
	    System.out.println(num);
      }
      catch(InputMismatchException ie)
      {
	    System.out.println("Input Mismatch Exception occurred");
      }
   }
}
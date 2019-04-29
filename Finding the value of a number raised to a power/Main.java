import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner scan = new Scanner(System.in);
      int base = scan.nextInt();
      int exponent = scan.nextInt();
      int result = 1,count = 0;
      while(count < exponent)
      {
        result = result * base;
        count+=1;
      }
      System.out.println(result);
    }
}
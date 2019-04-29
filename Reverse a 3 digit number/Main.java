import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int rev = 0;
    for(int idx = 0; num>0; idx++)
    {
      rev = rev*10 +num%10;
      num = num/10;
    }
    System.out.println(rev);
  }
}
import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      System.out.println(mul(num));
	} 

public static int mul(int num)
{
  return (num*num);
}
}
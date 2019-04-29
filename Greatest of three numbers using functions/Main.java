import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner scan = new Scanner(System.in);
      int n1 = scan.nextInt();
      int n2 = scan.nextInt();
      int n3 = scan.nextInt();
      great_num(n1,n2,n3);
	}
  public static void great_num(int x,int y,int z){
    if((x>y) && (x>z))
    {
      System.out.println(x);
    }
    else if ((y>x)&& (y>z))
    {
      System.out.println(y);
    }
    else
    {
      System.out.println(z);
    }
}
}
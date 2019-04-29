import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int x;
      for(int i=1;i<=num;i++)
      {
        x=i;
        while(x>0)
        {
          System.out.print(i);
          x--;
        }
        System.out.print("\n");
      }
	}
}
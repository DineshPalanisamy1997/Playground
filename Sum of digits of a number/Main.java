import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int sum = 0,rem = 0;
      for(int i=0;num>0;i++)
      {
        rem = num%10;
        sum = sum+ rem;
        num = num/10;
      }
      System.out.println(sum);
	}
}
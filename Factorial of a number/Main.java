import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int fact = 1;
      while(num>0)
      {
        fact = fact*num;
        num--;
	}
      System.out.println(fact);
}}
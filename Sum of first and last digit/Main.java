import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner scan = new Scanner(System.in);
      int first_digit=0,last_digit,sum=0,num1;
      int num = scan.nextInt();
      num1=num;
      for(int i=0; num1>10 ; i++)
      {
        first_digit = num1/10;
        num1 = num1/10;
      }
        last_digit = num%10;
      sum = first_digit + last_digit;
      System.out.println(sum);
	}
}
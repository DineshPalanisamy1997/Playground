import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int num1, num2,sum;
      num1 = num/100;
      num2 = num%10;
      sum = num1+num2;
      System.out.println(sum);
	}
}
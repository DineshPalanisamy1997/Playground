import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int n1,n2,sum;
      n1 = num/10;
      n2 = num%10;
      sum = n1+n2;
      System.out.println(sum);
	}
}
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int year = in.nextInt();
      if((year%4==0) && (year%100 ==0) && (year%400==0))
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
		// Type your code here
    }
}
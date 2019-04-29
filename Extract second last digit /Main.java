import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int sec_LD = (num%100)/10;
      System.out.println(sec_LD);
	}
}
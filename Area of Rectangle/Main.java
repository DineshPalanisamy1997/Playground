import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner get = new Scanner(System.in);
      int len = get.nextInt();
      int bh = get.nextInt();
      int area = len * bh;
      System.out.println(area);
	}
}
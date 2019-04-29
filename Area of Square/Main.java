import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner get = new Scanner(System.in);
      int side = get.nextInt();
      int area = side*side;
      System.out.println(area);
	}
}
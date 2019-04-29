import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int count = 1;
      while(count <= num)
      {
        System.out.println("I am a Java Developer");
        count++;
      }
	}
}
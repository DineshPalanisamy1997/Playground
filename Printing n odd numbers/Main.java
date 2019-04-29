import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner get = new Scanner(System.in);
      int n = get.nextInt();
      for(int i=0;i<n*2;i++)
      {
        if(i%2==1)
  			System.out.println(i);
      }
	}
}
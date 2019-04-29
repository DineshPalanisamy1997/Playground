import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      System.out.println(sum(num));
	}
    public static int sum(int num)
    {
      int sum =0;
      if(num==1)
      return 1;
      else 
      {
        while(num>0)
        {
          sum =sum+num;
          num--;
        }
        return sum;
      }
}
}
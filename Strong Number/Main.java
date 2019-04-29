import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int x,temp = num,fact=1,sum=0;
     while(num>0)
     {fact = 1;
       x = num%10;
       while(x>0)
       {
         fact = x*fact;
         x--;
       }
       
       sum = sum+fact;   
       num = num/10;
	}
      if(sum == temp)
         System.out.println("Yes");
      else
        System.out.println("No");
    }
}
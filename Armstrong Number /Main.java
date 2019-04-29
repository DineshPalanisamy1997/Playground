import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner get = new Scanner(System.in);
      int num = get.nextInt();
      int temp=num,sum=0,x,y,z;
     while(num>0)
     {
       x = num%10;
       num = num/10;
       sum = sum+(x*x*x);
	}
     if(sum == temp)
       System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
}}
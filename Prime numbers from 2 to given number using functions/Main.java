import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner ind = new Scanner(System.in);
	    int n = ind.nextInt();
	    
	    for(int i = 2; i <= n; i++)
	    {
	        if(is_prime(i))// Function call
	        {
	            System.out.println(i);
	        }
	    }
	    
	}
	
	public static boolean is_prime(int m)
	{
	    boolean is_prime = true;
	    for(int num = 2; num <= m/2; num++)
	    {
	        if(m % num == 0)
	        {
	            is_prime = false;
	            break;
	        }
	    }
	    return is_prime;
	}
}

import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int curr_row = 1; curr_row <= n; ++curr_row)
	    {
	         for(int curr_col = 1; curr_col <= n; ++curr_col)
	         {
	                if((curr_row == curr_col) ||
	                  (curr_row + curr_col == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}

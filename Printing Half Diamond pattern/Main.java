import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner scan  = new Scanner(System.in);
        
	    int n = scan.nextInt();
	    for(int curr_row = 1; curr_row <= n; ++curr_row)
	    {
          
	        for(int space = 1; space <=  n - curr_row; space++)
	        {
	            System.out.print(" ");
	        }
            
	        for(int curr_col = 1; curr_col <= (2 * curr_row - 1); ++curr_col)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
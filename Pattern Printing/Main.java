import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner scan = new Scanner(System.in);
      int row = scan.nextInt();
      int column = scan.nextInt();
      int temp = column;
      for(int index1 = 1; index1 <=row ; index1++)
      {
        for(int index2 = column; index2 > column - index1; index2--)
        {
          System.out.print(index2);
        }
        for(int index3 = 1; index3 <= column-index1 ; index3++)
        {
          System.out.print(row - index1 + 1);
        }
        System.out.println();
      }
    }
}

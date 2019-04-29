import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
   Scanner get = new Scanner(System.in);
    int num = get.nextInt();
    int j=1,k=1;
    for(int i=0;i<num;i++)
    {
      while(j<=3*k)
      {
        if(j<=num)
        {
          System.out.print(j);
          j++;
        }
      }
      k++; 
      System.out.print(",");
  }
  }
  
}
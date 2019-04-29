import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int list[] = new int[size];
    int max;
    for(int idx = 0 ; idx<size; idx++)
    {
      list[idx] = scan.nextInt();
    }
    if(list[0] > list[1])
    {
      max = 0;
    }
    else
    {
      max = 1;
    }
    for(int id = 0; id < size ; id++)
    {
      if(list[id] > list[max])
      {
        max = id;
      }
    }
    System.out.println(max);
  }
}
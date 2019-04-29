import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int list[] = new int[size];
    for(int idx = 0;idx<size; idx++)
    {
      list[idx] = scan.nextInt();
    }
    check(list,size);
  }
  public static void check(int get[], int size)
  {
    boolean is_perfect =true;
    int start = get[0] + get[1] + get[2];
    int last = 0,id;
    for(id = 3;id<size;id=id+3)
    {
      last = get[id] + get[id+1] + get[id+2];
      if(last!=start)
      {
        is_perfect = false;
      }
    }
    if(is_perfect == true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
}
}
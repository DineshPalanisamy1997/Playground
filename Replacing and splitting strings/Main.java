import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner scan = new Scanner(System.in);
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      int nop = scan.nextInt();
      String str3 = str1.replace(str1,str2);
      String[] flag= str3.split(" ",nop);
      for(int i = 0;i<nop ;i++)
      {
        System.out.println(flag[i]);
      }
    }
}
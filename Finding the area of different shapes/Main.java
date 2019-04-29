import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner scan = new Scanner(System.in);
      int option = scan.nextInt();
      switch(option){
        case 1:
          int side1 = scan.nextInt();
          int area1 = side1 * side1;
          System.out.println(area1);
          break;
        case 2:
          int side5 = scan.nextInt();
          int side6 = scan.nextInt();
          int area2 = side5 * side6;
          System.out.println(area2);
          break;
        case 3:
           int side11 = scan.nextInt();
           int side21 = scan.nextInt();
          int area = (side11 * side21)/2;
          System.out.println(area);
          break;
        case 4:
          int side = scan.nextInt();
          double area3 = 3.14 * side * side;
          System.out.println(area3);
          break;
      }
    }
}
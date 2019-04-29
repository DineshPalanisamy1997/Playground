import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    while(num>100)
    {
      num = num/10;
    }
    num = num%10;
    System.out.print(num);
  }
}
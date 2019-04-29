import java.util.Scanner;

class Faculty
{
  public void salary( int basicSalary)
  {
    System.out.println("Base Salary: "+basicSalary);
  }
}
class CSE
{
  public void salary(int basicSalary)
  {
   System.out.println("CSE Faculty: "+(basicSalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int basicSalary)
  {
   System.out.println("IT Faculty: "+(basicSalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int basicSalary)
  {
    System.out.println("ECE Faculty: " +(basicSalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int basicSalary = scan.nextInt();
    if(basicSalary > 0)
    {
      Faculty obj = new Faculty();
      obj.salary(basicSalary);
       CSE obj3 = new CSE();
       obj3.salary(basicSalary);  
       IT obj2 = new IT();
       obj2.salary(basicSalary);
       ECE obj1 = new ECE();
       obj1.salary(basicSalary);
      
    }
    else
    {
      System.out.println("null");
    }

    //implement your required concept here
  }
}
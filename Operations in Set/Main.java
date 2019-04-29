import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
       // type your code here
        BufferedReader kd= new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> dk=new LinkedHashSet<String>();
        String  a= kd.readLine();
        String[] num= a.split(",");
        for(int i = 0;i<num.length;i++)
        {
            dk.add(num[i]);
        }
        System.out.println(dk);
        System.out.print("Enter the value to be deleted: ");
        String no = kd.readLine();
        System.out.println(no);
        dk.remove(no);
        System.out.println(dk);
        System.out.print("Enter the value to be added: ");
        String n1 = kd.readLine();
        System.out.println(n1);
        dk.add(n1);
        System.out.println(dk);
    }
}
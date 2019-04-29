import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
       // type your code here
        BufferedReader kd= new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String,String> dk=new TreeMap<String,String>();
        System.out.print("Enter the number of values to be inserted in map:");
        int num= Integer.parseInt(kd.readLine());
        System.out.println(num);
        for(int i = 0;i<num;i++)
        {
           String key = kd.readLine();
          String value= kd.readLine();
            dk.put(key,value);
        }
        System.out.println(dk);
        System.out.print("Enter the index to be removed:");
        String n1 = kd.readLine();
        System.out.println(n1);
        dk.remove(n1);
        System.out.println(dk);
        System.out.print("Enter the index to insert:");
        String n2 = kd.readLine();
        System.out.println(n2);
        System.out.print("Enter the value to be inserted:");
        String n3 = kd.readLine();
        System.out.println(n3);
        dk.put(n2,n3);
        System.out.println(dk);
    }
}
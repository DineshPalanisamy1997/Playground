import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
        // type your code here
      BufferedReader kd= new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Integer> dk=new LinkedHashMap<String,Integer>();
        System.out.print("Enter the number of values to be inserted in map:");
        int num = Integer.parseInt(kd.readLine());
        System.out.println(num);
        for(int i = 0;i<num;i++)
        {
            String key = kd.readLine();
           int value = Integer.parseInt(kd.readLine());
            dk.put(key,value);
        }
        System.out.println(dk);
        System.out.print("Enter the index to be removed:");
        String n1 = kd.readLine();
        System.out.println(n1);
        dk.remove(n1);
        System.out.println(dk);
        System.out.println("Size of map is : "+dk.size());
    }
}
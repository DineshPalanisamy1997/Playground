import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
     // type your code here
       BufferedReader kd = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> dk=new TreeSet<String>();
        String a= kd.readLine();
        String[] num = a.split(",");
        for(int i = 0;i<num.length;i++)
        {
            dk.add(num[i]);
        }
        System.out.println(dk);
        Object ob[] = dk.toArray();
        int len = ob.length-1;
        while(dk.isEmpty()!=true)
        {
            Object ob1= ob[len];
            dk.remove(ob1);
            System.out.println(dk);
            --len;
        }
    }
}
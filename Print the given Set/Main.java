import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
      //type your code here
        BufferedReader kd = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> dk=new LinkedHashSet<String>();
        String num = kd.readLine();
        String[] arr = num.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            dk.add(arr[i]);
        }
        System.out.println(dk);
    }
}
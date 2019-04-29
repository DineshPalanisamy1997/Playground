import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
     // type your code here
      BufferedReader kd = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> dk = new TreeSet<String>();
        String str = kd.readLine();
        String[] a1 = str.split(",");
        System.out.println("Duplicate Entry is: "); 
        for (String st : a1) {
            if (!dk.add(st)) {
                System.out.println(st);
            }
        }
        System.out.println("TreeSet is : " + dk);
    }
}
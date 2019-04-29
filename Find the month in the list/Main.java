import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader kd = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> dl = new LinkedList<String>();
        String mon= kd.readLine();
        String[] a = mon.split(",");
        for(int i = 0;i<a.length;i++)
        {
            dl.add(a[i]);
        }
        System.out.println(dl);
        System.out.println("Size of the linked list: "+dl.size());
        System.out.println("Is LinkedList empty? "+dl.isEmpty());
                String str = kd.readLine();
        System.out.println("Does LinkedList contains "+str+"?");
        System.out.println(dl.contains(str));
    }
}

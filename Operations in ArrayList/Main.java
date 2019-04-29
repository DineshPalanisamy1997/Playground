import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader kd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();
        int num=1;
        while(num!=0)
        {
            System.out.println("Choose any one:");
            System.out.println("1.Insert");
            System.out.println("2.delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int n = Integer.parseInt(kd.readLine());
            switch(n)
            {
                case 1: String mon =kd.readLine();
                        String[] st =mon.split(",");
                        for(int i = 0;i<st.length;i++)
                        {
                            arr.add(st[i]);
                        }
                        break;
                case 2: System.out.print("Enter the index value to be deleted:");
                        int no = Integer.parseInt(kd.readLine());
                        System.out.println(no);
                        arr.remove(no);
                        break;
                case 3: System.out.println(arr);
                        break;
                case 4: num=0;break;
            }
        }
    }
}

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner scan = new Scanner(System.in);
      int arr_size = scan.nextInt();
      int flower = 0,flag = 0;
      int arr[] = new int[arr_size];
      for(int idx = 0;idx<arr_size;idx++)
        arr[idx] = scan.nextInt();
      int search_elem_1 = scan.nextInt();
      int search_elem_2 = scan.nextInt();
      for(int idx1 = 0;idx1<arr_size;idx1++)
      {
        if(search_elem_1 == arr[idx1])
        {
          System.out.println(idx1);
          flower++;
        }
      }
      if(flower==0)
        System.out.println("-1");
      for(int idx2 = 0;idx2<arr_size;idx2++)
      {
        if(search_elem_2 == arr[idx2])
        {  
         System.out.println(idx2);
          flag++;
        }
      }
      if(flag==0)
        System.out.println("-1");
    }
}
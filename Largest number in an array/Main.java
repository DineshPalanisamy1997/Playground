import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner scan = new Scanner(System.in);
      int arr_size = scan.nextInt();
      int temp = 0;
      int arr[] = new int[arr_size];
      for(int idx = 0;idx<arr_size;idx++)
        arr[idx] = scan.nextInt();
      for(int idx1 = 0;idx1<arr_size;idx1++)
      {
        for(int idx2 = idx1;idx2<arr_size;idx2++)
        {
          if(arr[idx1]<arr[idx2])
          {
            temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
          }
    }
}
      System.out.println(arr[0]);
    }
}
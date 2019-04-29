import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
       zero_at_the_end(arr_size, arr);
       for(int index = 0; index <= arr_size - 1; index++){
           System.out.print(arr[index] + " ");
       }
    }
    public static void zero_at_the_end(int arr_size, int arr[])
    {
        int cnt = 0;
        for(int inx = 0; inx < arr_size; inx++){
            if(arr[inx] != 0)
            {
                int temp = arr[inx];
                arr[inx] = arr[cnt];
                arr[cnt] = temp;
                cnt++;
            }
        }
    }
}
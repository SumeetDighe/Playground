import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int index = 0; index < size; index++)
        {
            arr[index] = sc.nextInt();
        }
        int sum_arr[] = new int[3 * size];
        sub_array(size, arr, sum_arr);
    }
    public static void sub_array(int size, int arr[], int sum_arr[])
    {
        for(int index1 = 0; index1 <= size - 1; index1++)
        {
            int key =  arr[index1];
            int flag = 1;
            for(int index2 = index1+1; index2<=size-1;index2++)
            {
                if(arr[index2]>key)
                {
                    for(int index3 = index1; index3 <= index2; index3++)
                    {
                        if(arr[index3]>arr[index2])
                        flag = 0;
                    }
                    if(flag == 1)
                    System.out.println(key+","+arr[index2]+" ");
                }
                flag = 1;
            }
        }
    }
}
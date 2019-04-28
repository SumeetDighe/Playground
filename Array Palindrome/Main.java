import java.util.Scanner;
class Main{
  static int palindrome(int arr[], int begin, int end) 
{ 
    // base case 
    if (begin >= end) { 
        return 1; 
    } 
    if (arr[begin] == arr[end]) { 
        return palindrome(arr, begin + 1, end - 1); 
    } 
    else { 
        return 0; 
    } 
} 
  
  
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0 ; i < n ; i++)
      {
        a[i] = sc.nextInt();
      }
       if (palindrome(a, 0, n - 1) == 1) 
        System.out.print( "Yes"); 
    else
        System.out.println( "No"); 
    }
}
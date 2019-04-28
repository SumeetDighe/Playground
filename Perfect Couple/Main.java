import java.util.Scanner;
class Main{
  public static void getPairsCount(int[] arr, int sum) 
    { 
     for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){ 
                if ((arr[i] + arr[j]) == sum) 
                {
                	System.out.println(arr[i]+", "+arr[j]);
                } 
            }
     }
  }
  
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[] arr = new int[size];
      for(int i = 0 ; i < size ; i++)
      {
      	arr[i] = sc.nextInt();
        
      }
      int sum = sc.nextInt();
      getPairsCount(arr, sum); 
    }
}

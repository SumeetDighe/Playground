import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    
        int n, max,index = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
                index = i ;
            }
        }
        System.out.print(index);
    
  }
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    
    
    for(int i = 1 ; i <= num ; i++ )
    {
    	System.out.print(i);
      	count++;
      	if(count == 3)
        {
        	System.out.print(",");
          	count = 0;
        }
      
    }
    
  }
}
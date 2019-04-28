import java.util.Scanner;
class Main{
  
  static int compare(int n1 , int n2, int n3)
  {
     int result = 0;
      
    if(n1 >= n2 && n1 >= n3)
    {
    	result = n1;	
    }
    else if(n2 >= n1 && n2 >= n3)
    {
    	result = n2;
    }
    else
    {
    	result = n3;
    }
  	return result;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
     
      
      System.out.print(compare(a,b,c));
	}
}
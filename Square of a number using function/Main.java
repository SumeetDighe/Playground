import java.util.Scanner;
class Main
{
  static int square(int n)
  {
  	int square = 0;
    square = n * n ;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      System.out.println(square(num));
	} 
}
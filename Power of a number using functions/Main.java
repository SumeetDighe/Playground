import java.util.Scanner;

class Main {
 	static int power(int b, int e)
    {
       int result = 1;
        while (e != 0)
        {
            result *= b;
            --e;
        }
    return result;
    }

  public static void main(String args[])
  {
  	Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int expo = sc.nextInt();
    
    System.out.println(power(base,expo));
  
  }
}
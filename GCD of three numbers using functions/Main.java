import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
     int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int gcd = 1;

        for(int i = 1; i <= n1 && i <= n2 && i <= n3; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0 && n3 % i==0)
                gcd = i;
        }

        System.out.print( gcd);
	}
}
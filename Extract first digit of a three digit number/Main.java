import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n1,n1_firstdigit;
      n1 = sc.nextInt();
      n1_firstdigit = n1/100 ;
      
      System.out.println(n1_firstdigit);
	}
}
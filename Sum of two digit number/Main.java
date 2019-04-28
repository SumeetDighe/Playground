import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1,n1_first,n1_second,sum;
      n1 = in.nextInt();
      n1_first = n1/10;
      n1_second = n1%10;
      
      sum = n1_first + n1_second;
      System.out.println(sum);
}
	}
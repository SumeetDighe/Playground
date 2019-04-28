import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      
	Scanner in = new Scanner(System.in);	
      int n1,answer,n1_first,n1_last;
      n1 = in.nextInt();
      	n1_first = n1/100;
      	n1_last = n1%10;
      answer = n1_first + n1_last;
      System.out.println(answer);
}
	}
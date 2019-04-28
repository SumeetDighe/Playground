import java.util.Scanner;
class Main{
  static int addNumbers(int a)
  {
    
   if (a != 0)
            return a + addNumbers(a - 1);
        else
            return a;
    
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int total = addNumbers(n);
        System.out.println(total);
	}
}
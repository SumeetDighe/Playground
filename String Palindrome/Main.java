import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
  		Scanner sc = new Scanner(System.in);
      	String str , rev = "";
      	str = sc. nextLine();
      	int length = str.length();
      
      for(int i = length - 1 ; i >= 0 ; i--)
      {
      		rev = rev + str.charAt(i);
      }
      
      if(str.equals(rev))
      {
      	System.out.print("Yes");
      }
      else
      {
      	System.out.print("No");
      }
      
    } 
  
}
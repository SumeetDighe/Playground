import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
  		Scanner sc = new Scanner(System.in);
      	 String Strmain = sc.nextLine();
      	String old = sc.nextLine();
      	String rp = sc.nextLine();
        
      System.out.println(Strmain.replace(old,rp)); 
       
    }
}
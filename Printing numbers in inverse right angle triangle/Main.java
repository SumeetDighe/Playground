import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
        int rows = sc.nextInt();
        
     
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
	}
}
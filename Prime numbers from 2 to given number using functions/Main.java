import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int primeNumber;
      for (int i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(int num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	    // primeNumbers = primeNumbers + i + " ";
        System.out.println(i);
	  }	
       }	
      
	}
}
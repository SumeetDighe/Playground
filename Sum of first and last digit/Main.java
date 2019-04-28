import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
		int number, first_digit, last_digit;
		sc = new Scanner(System.in);
      number = sc.nextInt();	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number % 10;	
    
      int sum = first_digit + last_digit;
      System.out.println(sum);
      
    }
}
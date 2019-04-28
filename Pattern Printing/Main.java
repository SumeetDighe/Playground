import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scanner = new Scanner(System.in);
      int rows = scanner.nextInt();
      int col = scanner.nextInt();
      int temp = 0;
      
      for (int i = rows; i >= 1; i--)
      {
         for (int j = col ; j >= i; j--)
            {
                System.out.print(j);
                temp =j;
            }
            for (int k = col - i+1; k < col; k++)
            {
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}	
import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      for (int row = 0; row < size; row++) {
        for (int col = 0; col < size; col++) {
            if (row == col || row + col == size - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
	}
}
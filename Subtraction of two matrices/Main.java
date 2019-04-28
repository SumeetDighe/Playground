import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    int m,n,i,j;
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		int mat1[][] = new int[n][m];
		int mat2[][] = new int[n][m];
		int mat3[][] = new int[n][m];
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				mat1[i][j] = scan.nextInt();
			}
		}
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				mat2[i][j] = scan.nextInt();
              }
		}
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				mat3[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				System.out.print(mat3[i][j]+ " ");
			}
			System.out.println();
		}
  }
}
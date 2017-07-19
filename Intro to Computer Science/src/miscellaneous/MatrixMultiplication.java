package miscellaneous;

public class MatrixMultiplication {
	
	public static void printMatrix(double[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}		
	}
	public static double[][] matrixMultiplication(double[][] a, double[][]b)
	{
		if(a[0].length != b.length)
		{
			System.out.println("The result is undefined!");
			System.exit(-1);
		}
		
		double[][] c = new double[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				for(int k = 0; k < b.length; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return c;
	}

	public static void main(String[] args)
	{
		double[][] matrixA =
			{
					{1, 2},
					{3, 1},
					{2, 3},
					{1, 0},
			};
		double[][] matrixB =
			{
					{3, 1, 1},
					{2, 0, 1},
			};
		
		double[][] answer = matrixMultiplication(matrixA, matrixB);
		
		printMatrix(answer);
	}
}

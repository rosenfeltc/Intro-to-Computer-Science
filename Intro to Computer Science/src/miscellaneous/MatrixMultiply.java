package miscellaneous;

public class MatrixMultiply 
{
		
		public static double[] matrixMultiply (double[][] a, double[] b)
		{
			if(a[0].length != b.length)
			{
				System.out.println("You suck!");
				System.exit(-1);
			}
			
			double[] c;
			c = new double[a.length];
			
			for(int i = 0; i < a.length; i++)
			{
				for(int j = 0; j < b.length; j++)
				{
					c[i] += a[i][j] * b[j];
				}
			}
			
			return c;
		}

		public static void main(String[] args)
		{
			double[][] matrixA =
			{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{1, 1, 2, 1},
			};
			
			double[] vector = {1, 0 , 1, 2};
			
			double[] answer = new double [matrixA[0].length];
									
			answer = matrixMultiply(matrixA, vector);
			
			for (int i = 0; i < answer.length; i++)
			{
				System.out.println(answer[i]);
			}
		}
}

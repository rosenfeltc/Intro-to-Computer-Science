package recursion;

public class Pell 
{
	public static double pellNumbers(double n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			return 2 * pellNumbers(n - 1) + pellNumbers(n - 2);
			
		}
	}
	public static void main(String[] args)
	{
		double n = 30;
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(pellNumbers(i) / pellNumbers(i+1));
		}
		System.out.println(Math.sqrt(2) - 1);
	}
}

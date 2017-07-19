package recursion;

public class GoldenRatio
{
	public static double recursiveGoldenRatio(double n)
	{
		if(n == 0)
		{
			return 1;
		}
		return 1 + 1 / recursiveGoldenRatio(n - 1);
	}
	
	public static double nonRecursiveGoldenRatio(double n)
	{
		double answer = 1;
		
		for(int i = 0; i < n; i++)
		{
			answer = 1 + 1 / answer;
		}
		
		return answer;
	}
	public static void main(String[] args)
	{
		double n = 8;
		System.out.println(recursiveGoldenRatio(n));
		System.out.println(nonRecursiveGoldenRatio(n));
	}
}

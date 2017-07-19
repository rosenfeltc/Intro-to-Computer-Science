package recursion;

public class Summation
{
	public static int nonRecursiveSum(int n)
	{
		int answer = 0;
		for(int i = 1; i <= n; i++)
		{
			answer += i;
		}
		
		return answer;
	}
	
	public static int recursiveSum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		
		return n + recursiveSum(n - 1);
	}
	public static void main(String[] args)
	{
		int number = 10;
		System.out.println(nonRecursiveSum(number));
		System.out.println(recursiveSum(number));
	}
}

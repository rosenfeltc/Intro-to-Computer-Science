package recursion;

public class Factorial 
{
	public static int nonRecursiveFactorial(int n)
	{
		int answer = 1;
		
		while(n > 0)
		{
			answer *= n;
			n--;
		}
		
		return answer;
	}
	
	public static int recursiveFactorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		return n * recursiveFactorial(n - 1);
	}
	
	public static void main(String[] args)
	{
		int number = 5;
		
		System.out.println(nonRecursiveFactorial(number));
		System.out.println(recursiveFactorial(number));
	}
}

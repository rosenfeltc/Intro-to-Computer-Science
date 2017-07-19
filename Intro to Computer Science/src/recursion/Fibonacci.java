package recursion;

public class Fibonacci 
{
	public static int nonRecursiveFibonacci(int n)
	{
		if(n == 1 || n == 2)
		{
			return 1;
		}
		int one = 1;
		int two = 1;
		int i = 2;
		int f = 0;
		while(i < n)
		{
			f = one + two;
			one = two;
			two = f;
			i++;
		}
		
		return f;
	}
	
	public static int recursiveFibonacci(int n)
	{
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}
	
	public static void main(String[] args)
	{
		int number = 30;
		
		System.out.println(nonRecursiveFibonacci(number));
		System.out.println(recursiveFibonacci(number));
	}
}

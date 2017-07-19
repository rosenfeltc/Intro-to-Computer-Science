package recursion;

public class McCarthy 
{
	public static int i = 0;
	
	public static int mcCarthy(int n)
	{
		i++;
		if(n > 100)
		{
			return n - 10;
		}
		else
		{
			return mcCarthy(mcCarthy(n + 11));
		}
	}
	
	public static void main(String[] args)
	{
		int n = 50;
		
		System.out.println(mcCarthy(n));
		System.out.println(i);
	}
}

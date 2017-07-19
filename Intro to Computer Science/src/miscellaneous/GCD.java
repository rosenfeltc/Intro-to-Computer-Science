package miscellaneous;

public class GCD 
{
	public static int gcd(int x, int y)
	{
		int r = 0;
		
		while(y != 0)
		{
			r = x % y;
			x = y;
			y = r;
		}
		
		return x;
	}
	public static void main(String[] args)
	{
		System.out.println(gcd(9282,286));
	}
}

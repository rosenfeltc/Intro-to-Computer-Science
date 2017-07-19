package recursion;

public class GCD
{
	public static int computeGCD(int p, int q)
	{
		int divisor = 1;
		int i = 2;
		
		while(i <= p && i <= q)
		{
			if(p % i == 0 && q % i == 0)
			{
				divisor = i;
			}
			
			i++;
		}
		
		return divisor;
	}
	
	public static int euclid(int p, int q)
	{
		if(q > p)
		{
			int temp = q;
			q = p;
			p = temp;
		}
		
		if(q == 0)
		{
			return p;
		}
		else
		{
			return euclid(q, p % q);
		}
	}
	
	public static void main(String[] args)
	{
		int a = 102;
		int b = 68;
		
		System.out.println("The gcd of (" + a +", " + b +") is: ");
		System.out.println(computeGCD(a,b));
		System.out.println(euclid(a,b));
		System.out.println(computeGCD(b,a));
		System.out.println(euclid(b,a));
	}
}

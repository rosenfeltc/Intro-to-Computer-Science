package miscellaneous;

public class ClassExample4 
{
	public static int gcd(int a, int b)
	{
		int counter = 1;
		int divisor = 0;
		
		while(counter <= a && counter <= b)
		{
			if (a % counter == 0 && b % counter == 0)
			{
				divisor = counter;
			}
			
			counter++;
		}
		
		return divisor;
	}
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 36;
		
		System.out.println(gcd(a, b));
	}

}

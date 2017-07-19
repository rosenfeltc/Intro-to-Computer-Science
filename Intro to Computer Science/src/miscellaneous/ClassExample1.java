package miscellaneous;

public class ClassExample1
{
	// Method to check and print all the numbers less than a that are multiples of b
	public static void factor(int a, int b)
	{
		int counter = b;
		
		while (counter <= a)
		{
			if(counter % b == 0)
			{
				System.out.println(counter);
			}
			counter++;
		}
	}
	public static void main(String[] args)
	{
		int number = 100;
		int divisor = 2;
		
		factor(number, divisor);

	}

}

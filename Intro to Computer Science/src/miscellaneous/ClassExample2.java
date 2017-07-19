package miscellaneous;

public class ClassExample2
{
	public static void powerOf(int base, int number)
	{
		int counter = 1;
		
		while(Math.pow(base, counter) <= number)
		{
			System.out.println(Math.pow(base, counter));
			counter++;
		}
	}
	public static void main(String[] args) 
	{
		int base = 2;
		int number = 10;
		
		powerOf(base, number);

	}

}

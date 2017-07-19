package miscellaneous;

public class ClassExample3
{
	public static void factorsOf(int number)
	{
		int counter = 1;
		
		while(counter <= number)
		{
			if(number % counter == 0)
			{
				System.out.println(counter);
			}
			counter++;
		}
	}
	public static void main(String[] args) 
	{
		int number = 20;
		
		factorsOf(number);

	}

}

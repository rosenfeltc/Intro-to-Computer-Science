package miscellaneous;

public class ContainsNumber
{
		public static boolean containsNumber(int[] numbers, int number)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(number == numbers[i])
			{
				return true;
			}
		}
		return false;
	}
		
	public static void main(String[] args)
	{
		int[] numbers = {7, 8, 9, 10, 11, 12};
		
		int number = 8;
		
		System.out.println(containsNumber(numbers, number));		
	}
}

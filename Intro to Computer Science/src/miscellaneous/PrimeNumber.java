package miscellaneous;

public class PrimeNumber
{
	// Method to determine if a number is prime
	public static boolean isPrime( int number)
	{
		int counter = 2;
		
		if (number < 2)
		{
			return false;
		}
		
		while(counter < number)
		{
			if( number % counter == 0)
			{
				return false;
			}
			
			counter++;
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{
		int number = 31;
		boolean isPrime = isPrime(number);
		
		if(isPrime)
		{
			System.out.println("The number " + number + "  is a prime number!");
		}
		else
		{
			System.out.println("The number " + number + " is not a prime number!");
		}
	
	}

}

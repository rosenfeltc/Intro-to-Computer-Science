package miscellaneous;

// Small program that checks wether the base is a power of the number
public class PowerOf2 {
	
	public static boolean powerOf2(int base, int number)
	{
		int power = base; //New variable since the base will be changing in the loop
		while(base <= number)
		{
			base *= power;
			if (base == number) // Then it is a power of the number so return true
			{
				return true;
			}
		}
		
		return false; //Since it never hit true and we went passed the number then it is false
	}
	public static void main(String[] args) 
	{
		int base = 2;
		int number = 256;
		
		System.out.println(powerOf2(base, number));

	}

}

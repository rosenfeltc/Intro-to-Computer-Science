package miscellaneous;

public class ArrayExample2
{
	public static void reverse(int[] a)
	{
		int temp = 0;
		int length = a.length - 1;
		
		for(int i = 0; i <= length; i++)
		{
			if (i >= length - i)
			{
				break;
			}
			
			temp = a[i];
			a[i] = a[length - i];
			a[length - i] = temp;
		}
		
		for(int i = 0; i <= length; i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		int[] numbers = {125, 4, 3, 11, 10, 1};
		
		reverse(numbers);

	}

}

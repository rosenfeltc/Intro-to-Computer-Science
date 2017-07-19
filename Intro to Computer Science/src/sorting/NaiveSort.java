package sorting;

public class NaiveSort 
{
	public static void printArray(int[] n)
	{
		for (int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}
	
	public static void sortArray(int[] n)
	{
		int min = 0;
		int position = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			min = n[i];
			for(int j = i + 1;j < n.length; j++)
			{
				if(n[j] < min)
				{
					min = n[j];
					position = j;
				}
				
			}
			n[position] = n[i];
			n[i] = min;
		}
	}
	public static void main(String[] args)
	{
		int[] numbers = {4, 1, 5, 2, 9, 9, 10, 22, 3, 5, 7, 8, 2, 0, 33, 98, 6};
		
		printArray(numbers);
		sortArray(numbers);
		printArray(numbers);
	}
}

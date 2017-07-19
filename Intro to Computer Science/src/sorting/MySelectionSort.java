package sorting;

public class MySelectionSort 
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void selectionSort(int[] n)
	{
		int temp = 0;
		int position = 0;
		
		for(int i = 0; i < n.length - 1; i++)
		{
			temp = n[i];
			position = i;
			for(int j = i + 1; j < n.length; j++)
			{
				if(n[j] < temp)
				{
					temp = n[j];
					position = j;
				}
			}
			n[position] = n[i];
			n[i] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		int[] numbers = {4, 1, 5, 2, 9, 9, 10, 22, 3, 5, 7, 8, 2, 0, 33, 98, 6};
		printArray(numbers);
		selectionSort(numbers);
		printArray(numbers);
	}
}

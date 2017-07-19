package sorting;

public class SelectionSort 
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void selectionSort(int[] a)
	{
		int i = 0;
		int j = 0;
		int temp = 0;
		int minval = 0;
		int indexSmallest = -1;
		while(i < a.length - 1)
		{
			j = i + 1;
			minval = a[i];
			indexSmallest = i;
			while(j < a.length)
			{
				if(a[j] < minval)
				{
					minval = a[j];
					indexSmallest = j;
				}
				j += 1;
			}
			temp = a[i];
			a[i] = minval;
			a[indexSmallest] = temp;
			i += 1;
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

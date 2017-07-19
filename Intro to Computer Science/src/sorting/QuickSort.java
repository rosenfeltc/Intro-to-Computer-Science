package sorting;

public class QuickSort 
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ,");
		}
		System.out.println();
	}
	
	public static int partition(int[] n, int start, int end)
	{
		int key = n[end];
		int i = start - 1;
		int j = start;
		int temp;
		
		while(j < end)
		{
			if(key > n[j])
			{
				temp = n[j];
				n[j] = n[i+1];
				n[i+1] = temp;
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		
		temp = n[i+1];
		n[i+1] = key;
		n[end] = temp;
		
		return i+1;
	}
	public static void quickSort(int[] n, int start, int end)
	{
		if(start < end)
		{
			int q = partition(n, start, end);
		
			quickSort(n, start, q - 1);
			quickSort(n, q + 1, end);
		}
		
	}
	public static void main(String[] args)
	{
		int[] numbers = {2, 8, 7, 1, 3, 5, 6, 4};
		int start = 0;
		int end = numbers.length - 1;
		
		printArray(numbers);
		quickSort(numbers, start, end);
		printArray(numbers);
	}
}

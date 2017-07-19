package sorting;

public class InsertionSort
{
	public static void printArray(int[] n)
	{
		int i = 0;
		while(i < n.length)
		{
			System.out.print(n[i] + " ");
			i++;
		}
		
		System.out.println();
	}
	
	public static void insertionSort(int[] a)
	{
		int i = 1;
		int j = 0;
		int key = 0;
		
		while(i < a.length)
		{
			key = a[i];
			j = i - 1;
			while(j >= 0 && a[j] > key)
			{
				a[j+1] = a[j];
				j -= 1;
			}
			a[j+1] = key;
			i += 1;
		}
	}
	public static void main(String[] args)
	{
		int[] numbers = {4, 1, 5, 2, 9, 9, 10, 22, 3, 5, 7, 8, 2, 0, 33, 98, 6};
		
		printArray(numbers);
		insertionSort(numbers);
		printArray(numbers);
	}
}

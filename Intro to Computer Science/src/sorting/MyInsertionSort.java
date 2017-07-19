package sorting;

public class MyInsertionSort 
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] n)
	{
		int key = 0;
		int j = 0;
		for(int i = 1; i < n.length; i++)
		{
			key = n[i];
			j = i - 1;
			while(j >= 0 && key < n[j])
			{
				n[j+1] = n[j];
				j -= 1;
			}
			n[j+1] = key; 
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

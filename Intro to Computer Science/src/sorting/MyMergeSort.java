package sorting;

public class MyMergeSort 
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void mergeSort(int[] n, int first, int last)
	{
		if(first >= last)
		{
			return;
		}
		int mid = (first + last) / 2;
		mergeSort(n, first, mid);
		mergeSort(n, mid + 1, last);
		sort(n, first, mid, last);
	}
	
	public static void sort(int[] n, int first, int mid, int last)
	{
		int[] helper = new int[n.length];
		for(int i = 0; i < helper.length; i++)
		{
			helper[i] = n[i];
		}
		
		int i = first;
		int j = mid + 1;
		int k = first;
		while(i <= mid && j <= last)
		{
			if(helper[i] < helper[j])
			{
				n[k] = helper[i];
				i++;
			}
			else
			{
				n[k] = helper[j];
				j++;
			}
			k++;
		}
		while(i <= mid)
		{
			n[k] = helper[i];
			i++;
			k++;
		}
	}
	public static void main(String[] args)
	{
		int[] numbers = {14, 7, 3, 12, 9, 11, 6, 2};
		
		printArray(numbers);
		mergeSort(numbers, 0, numbers.length - 1);
		printArray(numbers);
	}
}

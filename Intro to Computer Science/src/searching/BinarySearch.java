package searching;

public class BinarySearch 
{
	public static int nonRecursiveBinarySearch(int[] n, int key)
	{
		int i = 0;
		int j = n.length;
		int m = 0;
		int position = -1;
		
		while(i < j)
		{
			m = (i + j) / 2;
			if(key > n[m])
			{
				i = m + 1;
			}
			else if(key < n[m])
			{
				j = m;
			}
			else
			{
				position = m;
				break;
			}
		}
		
		return position;
	}
	
	public static int recursiveBinarySearch(int[] n, int key, int start, int end)
	{
		if(start < end)
		{
			int m = (start + end) / 2;
			
			if(key > n[m])
			{
				return recursiveBinarySearch(n, key, m + 1, end);
			}
			else if(key < n[m])
			{
				return recursiveBinarySearch(n, key, start, m);
			}
			else
			{
				return m;
			}
		}
		
		return -1;
	}
	public static void main(String[] args)
	{
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(recursiveBinarySearch(numbers, 10, 0, numbers.length));
		System.out.println(nonRecursiveBinarySearch(numbers, 10));
	}
}

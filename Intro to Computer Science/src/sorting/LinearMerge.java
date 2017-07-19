package sorting;

public class LinearMerge
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] linearMerge(int[] a, int start, int middle, int end)
	{
		int i = start;
		int j = middle + 1;
		int k = i;
		int[] temp = new int[a.length];
		
		while(i <= middle && j < end)
		{
			if(a[i] < a[j])
			{
				temp[k] = a[i];
				i += 1;
			}
			else
			{
				temp[k] = a[j];
				j += 1;
			}
			k += 1;
		}
		
		for(int p = 0; p < temp.length; p++)
		{
			System.out.print(temp[p] + ", ");
		}
		System.out.println("");
		System.out.println(i + ", " + j + ", " + k);
		
		while(i <= middle)
		{
			temp[k] = a[i];
			i += 1;
			k += 1;
		}
		
		while(j < end)
		{
			temp[k] = a[j];
			j += 1;
			k += 1;
		}
		
		return temp;
	}
	public static void main(String[] args)
	{
		int[] numbers = {45, 77, 81, 85, 89, 22, 79, 91, 92, 94};
		
		printArray(numbers);
		numbers = linearMerge(numbers, 0, 4, 10);
		printArray(numbers);
	}
}

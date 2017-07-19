package sorting;

public class MyLinearMerging 
{
	public static void printArray(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
	}
	
	public static int[] linearMerge(int[] n)
	{
		int middle = Math.floorDiv(n.length, 2);
		int[] a = new int[middle];
		int[] b = new int[middle];
		
		int aPointer = 0;
		int bPointer = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(i < middle)
			{
				a[aPointer] = n[i];
				aPointer++;
			}
			else
			{
				b[bPointer] = n[i];
				bPointer++;
			}
		}
		
		aPointer = 0;
		bPointer = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(aPointer < a.length && bPointer < b.length && a[aPointer] < b[bPointer])
			{
				n[i] = a[aPointer];
				aPointer++;
			}
			else if(bPointer < b.length && aPointer < a.length && b[bPointer] < a[aPointer])
			{
				n[i] = b[bPointer];
				bPointer++;
			}
			else if(bPointer >= b.length)
			{
				n[i] = a[aPointer];
				aPointer++;
			}
			else
			{
				n[i] = b[bPointer];
				bPointer++;
			}
		}
		
		return n;
	}
	public static void main(String[] args)
	{
		int[] numbers = {45, 77, 81, 85, 89, 22, 79, 91, 92, 94};
		
		printArray(numbers);
		linearMerge(numbers);
		printArray(numbers);
	}
}

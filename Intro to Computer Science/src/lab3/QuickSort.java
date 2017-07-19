/* This is Quicksort.java that contains the methods quickSort and partition.
 * Coded by Christopher Rosenfelt for CSI/CEN 201 on July 03, 2017.
 */
package lab3;

public class QuickSort 
{
	// Partition method that will perform quicksort on the array that is passed into it after selecting the key
	public static int partition(City[] cities, int start, int end, String field)
	{
		// Declare the necessary variables
		City key = cities[end];
		City temp;
		int i = start - 1;
		int j = start;
		int code = 0;
		
		// Iterate from j to before the last position in the array since that will be the key
		while(j < end)
		{
			// If-else statements to decide what method to call based on the appropriate field
			// a value for code will be returned which will be used next
			if(field.equals("name"))
			{
				code = key.compareToName(cities[j]);
			}
			else if(field.equals("population"))
			{
				code = key.compareToPopulation(cities[j]);
			}
			else if(field.equals("latitude"))
			{
				code = key.compareToLatitude(cities[j]);
			}
			
			// Based on the value of the code, decide if key is "greater" than the city at j
			// adjust accordingly based on the functioning of quicksort
			if(code >= 0)
			{
				temp = cities[j];
				cities[j] = cities[i+1];
				cities[i+1] = temp;
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		
		// This is to place the key in its proper position and return that position back to the quickSort method
		temp = cities[i+1];
		cities[i+1] = key;
		cities[end] = temp;
		
		return i+1;
	}
	
	// Recursive method that performs quickSort on an array of City, used partition method to accomplish the result
	public static void quickSort(City[] cities, int start, int end, String field)
	{
		// Very important to make sure that the start is less than the end so that the arrays are properly
		// sublisted based on the position of the key
		if(start < end)
		{
			// Call the partition method and store the key position that is passed in the variable q
			int q = partition(cities, start, end, field);
			
			// Sort the values less than q using quicksort
			quickSort(cities, start, q - 1, field);
			// Sort the values greater than q using quicksort
			quickSort(cities, q + 1, end, field);
		}
		
	}
}


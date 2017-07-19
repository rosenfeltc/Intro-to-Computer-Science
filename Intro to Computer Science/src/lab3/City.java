/* This is City.java that contains the class City with its instance variables and methods relating to it.
 * Coded by Christopher Rosenfelt for CSI/CEN 201 on July 03, 2017.
 */
package lab3;

public class City 
{
	// Declare instance variables for the City class
	public String code;
	public String name;
	public String region;
	public int population;
	public double latitude;
	public double longitude;
	
	// City constructor
	public City(String c, String n, String r, int p, double lat, double lon)
	{
		code = c;
		name = n;
		region = r;
		population = p;
		latitude = lat;
		longitude = lon;
	}
	
	// Method that returns a string composed of a City's name,population,latitude,longitude
	public String toString()
	{
		return name + "," + population + "," + latitude + "," + longitude; 
	}
	
	// Method that compares the names of two cities lexicographically and returns the appropriate result
	public int compareToName(City c)
	{
		// Before comparison, store the names all in lower case
		String a = name.toLowerCase();
		String b = c.name.toLowerCase();
		
		return a.compareTo(b);
	}
	
	// Method that compares the sizes of the populations of two cities and returns the appropriate result
	public int compareToPopulation(City c)
	{
		if(population < c.population)
		{
			// returning 1 instead of -1 because we want population sorted from highest to lowest
			return 1;
		}
		else if(population > c.population)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	// Method that compares the latitude of two cities and returns the appropriate result
	public int compareToLatitude(City c)
	{
		if(latitude < c.latitude)
		{
			return -1;
		}
		else if(latitude > c.latitude)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

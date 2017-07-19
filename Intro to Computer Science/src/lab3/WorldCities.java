/* This is WorldCities.java this contains the instance array variable of type City and the main method that uses the
 * other two classes to complete the homework. Coded by Christopher Rosenfelt for CSI/CEN 201 on July 03, 2017.
 */
package lab3;

import java.awt.Font;

import edu.princeton.cs.introcs.*;

public class WorldCities 
{
	City[] cities;
	
	// Constructor to initialize an array of type City
	public WorldCities(int index)
	{
		cities = new City[index];
	}
	
	public void displayCities(int n)
	{
		// Prepare background using the appropriate latitude and longitude values for x-scale and y-scale
		StdDraw.setCanvasSize(720, 360);
		StdDraw.setXscale(-180, 180);
		StdDraw.setYscale(-90, 90);
		
		// Prepare the font for text
		Font font = new Font("Arial", Font.BOLD, 20);
		StdDraw.setFont(font);
		
		// Sort by most populous cities
		QuickSort.quickSort(cities, 0, cities.length - 1, "population");
		
		// EXTRA CREDIT - Iterate and display the n = 50 most populous cities one at a time
		StdDraw.enableDoubleBuffering();
		for(int i = 0; i < n; i++)
		{
			// Blink the city as an orange square 3 times first
			for(int j = 0; j < 3; j++)
			{
				StdDraw.picture(0, 0, "file:world.png");
				StdDraw.show(500);
				StdDraw.setPenColor(255, 140, 0); // Orange color
				StdDraw.filledRectangle(cities[i].longitude, cities[i].latitude, 2, 2);
				StdDraw.show(500);
				StdDraw.clear();
			}
			
			// Display the city as a red square with the name above it
			StdDraw.picture(0, 0, "file:world.png");
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(cities[i].longitude, cities[i].latitude + 7, cities[i].name);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledRectangle(cities[i].longitude, cities[i].latitude, 2, 2);
			StdDraw.show(3000);
		}
		StdDraw.show(3000);
		
		// Iterate and display all the n = 50 most populous cities at one time
		StdDraw.disableDoubleBuffering();
		StdDraw.clear();
		StdDraw.setPenColor(255, 140, 0); // Orange color
		StdDraw.picture(0, 0, "file:world.png");
		for(int i = 0; i < n; i++)
		{
			StdDraw.filledRectangle(cities[i].longitude, cities[i].latitude, 2, 2);
		}
	}
	public static void main(String[] args)
	{
		// Declare the necessary variables
		int lines = 0;
		String c, n, r;
		int p; 
		double lat, lon;
		
		In input = new In("world_cities.txt");
		
		// Find out how many lines are in the text by iterating through each line
		while(!input.isEmpty())
		{
			lines += 1;
			input.readLine();
		}
		input.close();
		
		// Create an array of type City and store each city in the array
		WorldCities wc = new WorldCities(lines);
		input = new In("world_cities.txt");
		for(int i = 0; i < lines; i++)
		{
			// Store each line read into a string and then use split to separate each string
			// by the comma delimiter and place into a temporary array
			String info = input.readLine();
			String[] temporary = info.split(",");
			
			// Use the values in the temporary array to create the City object and place in the array
			c = temporary[0];
			n = temporary[1];
			r = temporary[2];
			p = Integer.parseInt(temporary[3]);
			lat = Double.parseDouble(temporary[4]);
			lon = Double.parseDouble(temporary[5]);
			
			wc.cities[i] = new City(c, n, r, p, lat, lon);
		}
		input.close();
		
		// Write the city values from the Array of type City to text using toString method
		Out output = new Out("cities_out.txt");
		for(int i = 0; i < wc.cities.length; i++)
		{
			output.println(wc.cities[i].toString());
		}
		output.close();
		
		// Sort the cities alphabetically and write to text
		QuickSort.quickSort(wc.cities, 0, wc.cities.length - 1, "name");
		output = new Out("cities_alpha.txt");
		for(int i = 0; i < wc.cities.length; i++)
		{
			output.println(wc.cities[i].toString());
		}
		output.close();
		
		// Sort the cities by population size and write to text
		QuickSort.quickSort(wc.cities, 0, wc.cities.length - 1, "population");
		output = new Out("cities_population.txt");
		for(int i = 0; i < wc.cities.length; i++)
		{
			output.println(wc.cities[i].toString());
		}
		output.close();
		
		// Sort the cities by population size and write to text
		QuickSort.quickSort(wc.cities, 0, wc.cities.length - 1, "latitude");
		output = new Out("cities_latitude.txt");
		for(int i = 0; i < wc.cities.length; i++)
		{
			output.println(wc.cities[i].toString());
		}
		output.close();
		
		// Display the 50 most populous cities
		wc.displayCities(50);
	}
}

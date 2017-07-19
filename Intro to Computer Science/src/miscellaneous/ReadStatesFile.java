package miscellaneous;

import edu.princeton.cs.introcs.In;

public class ReadStatesFile 
{

	public static void main(String[] args)
	{
		// open file
		In input = new In("states.txt");
		
		// read a String from the file, and print it out
		// this library separates strings with symbols like
		// space, comma, semicolon, etc.
		System.out.println(input.readString());
		
		// close the file
		input.close();
		
		// re-open the file
		input = new In("states.txt");
		
		// read a line from the file
		System.out.println(input.readLine());
		
		// close the file
		input.close();
		
		// re-open file
		input = new In("states.txt");
		
		// declare a char variable
		// initialize it
		char nextChar = 'a';
		
		// keep reading char until I met char '\n'
		// newline character
		while(nextChar != '\n')
		{
			// read the next char
			nextChar = input.readChar();
			
			// print the char
			System.out.print(nextChar);
		}
		
		// close the file
		input.close();
	}

}

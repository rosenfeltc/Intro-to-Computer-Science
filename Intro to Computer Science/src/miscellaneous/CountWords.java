package miscellaneous;
import edu.princeton.cs.introcs.In;

public class CountWords 
{
	public static int wordCount(String filename, String word)
	{
		int counter = 0;
		String temporary;
		In input = new In(filename);
		
		while(!input.isEmpty())
		{
			temporary = (input.readString());
			if(word.equals(temporary.toLowerCase()))
				{
					counter++;
				}
		}
		
		return counter;
	}

	public static void main(String[] args) 
	{
			String file = "moby_dick.txt";
			String word = "moby";
			System.out.println(wordCount(file, word));;
			word = "apple";
			System.out.println(wordCount(file, word));
	}

}

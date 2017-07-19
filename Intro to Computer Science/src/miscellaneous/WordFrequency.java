package miscellaneous;
import edu.princeton.cs.introcs.In;
import java.util.ArrayList;

public class WordFrequency
{
	public String str;
	private int count;
	
	public WordFrequency(String content)
	{
		str = content;
		count = 1;
	}
	
	public void increaseFrequency()
	{
		count += 1;
	}
	
	public int getCurrentCount()
	{
		return count;
	}
	
	public static void main(String[] args)
	{
		ArrayList<WordFrequency> wc = new ArrayList<WordFrequency>();
		In input = new In("moby_dick.txt");
		String str = "";
		boolean exists = false;
		
		while (!input.isEmpty())
		{
			str = input.readString();
			
			for (int i = 0; i < wc.size(); i++)
			{
				if(str.equals(wc.get(i).str))
					{
						wc.get(i).increaseFrequency();
						exists = true;
						break;
					}
			}
			if (!exists)
			{
				wc.add(new WordFrequency(str));
			}
		}
		input.close();
		
		
	}
}

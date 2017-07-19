package miscellaneous;

public class Anagram 
{
	public static boolean isAnagram(String t, String s)
	{
		char[] word1 = new char[t.length()];
		char[] word2 = new char[s.length()];
		int word1Count = 0;
		int word2Count = 0;
		boolean found = false;
		
		while(word1Count < t.length())
		{
			word1[word1Count] = t.charAt(word1Count);
			word1Count++;
		}
		
		while(word2Count < s.length())
		{
			word2[word2Count] = t.charAt(word2Count);
			word2Count++;
		}
		
		if (word1Count != word2Count)
		{
			return false;
		}
		else
		{
			for(int i = 0; i < word1Count; i++)
			{
				for(int j = 0; j < word2Count; j++)
				{
					if(word1[i] == word2[j])
					{
						found = true;
					}
				}
				
				if(!found)
				{
					return false;
				}
				found = false;
			}
		}
		
		return true;
	}
	public static void main(String[] args)
	{
		String word1 = "cinema";
		String word2 = "icaman";
		
		System.out.println(isAnagram(word1, word2));
	}
}

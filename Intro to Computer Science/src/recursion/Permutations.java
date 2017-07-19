package recursion;

public class Permutations 
{
	public static void perm(String s)
	{
		perm ("", s);
	}
	
	public static void perm(String prefix, String s) 
	{
		int n = s.length();
		if (n == 0) 
		{
	      System.out.println(prefix);
	    }
	    for (int i = 0; i < n; i++) 
	    {
	      perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
	    }
	}
	
	public static void main(String[] args) 
	{
		int i = 0;
	    int n = 4;
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    perm(alphabet.substring(i, n + i));
	}
}

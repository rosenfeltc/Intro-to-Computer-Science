package recursion;

public class TowerOfHanoi 
{
	public static void towerOfHanoi(int n, String from, String temp, String to)
	{
		if(n == 1)
		{
			System.out.println(from + " --> " + to);
		}
		else
		{
			towerOfHanoi(n - 1, from, to, temp);
			System.out.println(from + " --> " + to);
			towerOfHanoi(n - 1, temp, from, to);
		}
	}
	public static void main(String[] args)
	{
		int discs = 4;
		towerOfHanoi(discs,"A","B","C");
	}
}

package miscellaneous;

public class Exam 
{
	public static boolean yoda1()
	{
		System.out.println("Do or do not.");
		return false;
	}
	
	public static boolean yoda2()
	{
		System.out.println("There is no try.");
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(yoda1() && yoda2());
	}

}

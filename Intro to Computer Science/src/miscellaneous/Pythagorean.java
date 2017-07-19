package miscellaneous;

import java.math.*;

public class Pythagorean 
{

	public static double pythagoreanTheorem(double a, double b)
	{
		double hypotenuse = Math.sqrt(a * a + b * b);
		return hypotenuse;
	}

	public static void main(String[] args)
	{
		double shortside = 6;
		double longside = 8;
		double hypotenuse = pythagoreanTheorem(shortside, longside);
		System.out.println("The hypotenuse of the right triangle is " + hypotenuse);
	}
}

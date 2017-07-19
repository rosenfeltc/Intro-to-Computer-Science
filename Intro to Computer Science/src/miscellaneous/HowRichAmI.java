package miscellaneous;

import java.math.*;

public class HowRichAmI 
{
	public static double howRichAmI(double deposit, double rate, int time)
	{
		return (deposit * Math.pow((1 + rate), time));
	}
	
	public static void main(String[] args) 
	{
		double deposit = 1;
		double interestRate = .05;
		int years = 2016;
		
		double currentBalance = howRichAmI(deposit, interestRate, years);
		
		System.out.println("My current balance is " + currentBalance);

	}

}

package miscellaneous;

public class howRichAmI2 
{
	public static void howRichAmI(double deposit1, double deposit2, double interestRate1, double interestRate2)
	{
		int year = 0;
		double currentBalance1 = deposit1;
		double currentBalance2 = deposit2;
		
		while(currentBalance1 < currentBalance2)
		{
			currentBalance1 = (deposit1 * Math.pow((1 + interestRate1), year));
			currentBalance2 = (deposit2 * Math.pow((1 + interestRate2), year));
			year++;
		}
		
		year--;
		
		System.out.println("My balance  of " + currentBalance1 + " is greater than Thomas' balance of " +
		currentBalance2 + " in the year " + year);
		
		 
	}
	
	public static void main(String[] args) 
	{
		double deposit1 = 1;
		double deposit2 = 100000;
		double interestRate1 = .05;
		double interestRate2 = .04;
		
		howRichAmI(deposit1, deposit2, interestRate1, interestRate2);
		

	}

}

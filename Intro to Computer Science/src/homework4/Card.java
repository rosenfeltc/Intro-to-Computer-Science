/* This is the Card class with the relevant methods needed for the proper execution of the Test Code. Coded by
 *  Christopher Rosenfelt for CSI/CEN 201 on 06/14/2017.
 */
package homework4;

public class Card
{
	public int value;
	public int suit;
	
	public Card(int v, int s)
	{
		value = v;
		suit = s;
	}
	
	public String toString()
	{	
		String answer ="";
		
		// Figure out the value of the card and print
		if(value == 1)
		{
			answer = "Ace of ";
		}
		else if(value == 11)
		{
			answer = "Jack of ";
		}
		else if(value == 12)
		{
			answer = "Queen of ";
		}
		else if(value == 13)
		{
			answer = "King of ";
		}
		else if(value > 1 && value < 11)
		{
			answer = value + " of ";
		}
		else
		{
			System.out.println("That is not a valid card number!");
			System.exit(1);
		}
		
		// Figure out the suit of the card and print
		if(suit == 1)
		{
			answer += "clubs";
		}
		else if(suit == 2)
		{
			answer += "spades";
		}
		else if(suit == 3)
		{
			answer += "diamonds";
		}
		else if(suit == 4)
		{
			answer += "hearts";
		}
		else
		{
			System.out.println("That is not a valid suit!");
			System.exit(1);
		}
		
		return answer;
	}
	
	
}

/* This is the Deck class with the relevant methods needed for the proper execution of the Test Code. Coded by
 *  Christopher Rosenfelt for CSI/CEN 201 on 06/14/2017.
 */
package homework4;

import java.util.ArrayList;

public class Deck
{
	// Creating a deck that will allow cards
	public ArrayList<Card> cards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
	}
	
	// Add cards with i representing the 4 different suits
	// j represents the different values
	public void addStandardCards()
	{
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 13; j++)
			{
				cards.add(new Card(j+1,i+1));
			}
		}
	}
	
	// Return how many cards are in my deck
	public int size()
	{
		return cards.size();
	}
	
	// Return my deck filled with cards
	public ArrayList<Card> getCardList()
	{
		return cards;
	}
	
	public void addStandardCardsRandom()
	{
		// Initialize variables that will be needed to swap randomly the cards in the deck
		int random1 = 0;
		int random2 = 0;
		int temp = 0;
		
		// Establish all 52 values of cards and place in a defined array
		int[] shuffle = new int[52];
		
		for(int i = 0; i < 52; i++)
		{
			shuffle[i] = i+1;
		}
		
		// Let's randomly shuffle, 52 iterations is arbitrary number
		for(int i = 0; i < 52; i++)
		{
			// Provide equally likely value from 0 to 51 since function does not include 1
			random1 = (int) (Math.random()*52);
			random2 = (int) (Math.random()*52);
			
			// Switch the cards around using a temporary variable
			temp = shuffle[random1];
			shuffle[random1] = shuffle[random2];
			shuffle[random2] = temp;
		}
		
		// Let's add the cards to the deck
		for(int i = 0; i < 52; i++)
		{
			// Use modulus + 1 to provide the correct card value
			// Use the ceiling function of the card number / by 13.0 to get the correct card suit represented as an int
			cards.add(new Card((shuffle[i] % 13) + 1, (int) Math.ceil(shuffle[i] / 13.0)));
		}
	}
	
	// Deal an inputed number of cards from the end of the deck
	public ArrayList<Card> deal(int numberOfCards)
	{
		int deckSize = cards.size();
		// Initialize a new array of cards that will contain the hand
		ArrayList<Card> hand = new ArrayList<Card>();
		
		// Remember that we are dealing from the end of the deck
		for(int i = deckSize - 1; i >= deckSize - numberOfCards; i--)
		{
			hand.add(cards.get(i));
			cards.remove(i);
		}
		
		return hand;
	}
	
	// Use the cards that were dealt to establish the hand
	public void addCards(ArrayList<Card> h)
	{	
		for(int i = 0; i < h.size(); i++)
		{
			cards.add(h.get(i));
		}
	}
	
}

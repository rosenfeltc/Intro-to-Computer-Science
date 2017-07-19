package homework4;

public class Simulation
{
	public static void main(String[] args)
	{
		Card card = new Card(5, 1);
		//prints "5 of clubs"
		System.out.println(card.toString());

		Card card1 = new Card(12, 4);
		//prints "Queen of hearts"
		System.out.println(card1.toString());

		System.out.println("----");

		Deck deck1 = new Deck();
		//Add the 52 standard cards to the new deck
		deck1.addStandardCards();
		
		//print the cards in the deck1
		for (int i = 0; i < deck1.getCardList().size(); i++)
		{
			System.out.println(deck1.getCardList().get(i).toString());
		}


		Deck deck2 = new Deck();
		//Add 52 standard cards to the new deck in random order;
		deck2.addStandardCardsRandom();

		//Create a new tiny Deck of cards called hand, made up
		//of the last five cards in deck.  The deal method should
		//also remove those last five cards from "deck2".
		Deck hand = new Deck();
		hand.addCards(deck2.deal(5));

		//print the cards in the hand
		for (int i = 0; i < hand.getCardList().size(); i++)
		{
			System.out.println(hand.getCardList().get(i).toString());
		}
   

		System.out.println("----");

		//print the remaining cards in the deck2
		for (int i = 0; i < deck2.getCardList().size(); i++)
		{
			System.out.println(deck2.getCardList().get(i).toString() );
		}
	}
}
package pokerPackage;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {

    private ArrayList<Card> deck;
    private Random random;

    public DeckOfCards() {
        this.deck = new ArrayList<>();
        this.random = new Random();

        String suite = "C"; //CLUB
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, suite)); //Card values are 1-13
        }
        suite = "S"; //SPADE
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, suite));
        }
        suite = "H"; //HEART
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, suite));
        }
        suite = "D"; //DIAMOND
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, suite));
        }

    }

    public void addToDeck(Card newCard) {
        this.deck.add(newCard);
    }

    public Card dealRandomCard() {
        int cardsLeft = this.deck.size();
        int chosen = this.random.nextInt(cardsLeft - 1);
        Card card = deck.get(chosen);
        deck.remove(card);
        return card;
    }

}

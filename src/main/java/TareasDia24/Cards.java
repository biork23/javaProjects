package TareasDia24;

import java.util.*;

class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

public class Cards {
    private Set<Card> deck;
    private List<Card> cardsOnTable;

    public Cards() {
        deck = new HashSet<>();
        cardsOnTable = new ArrayList<>();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public void shuffleCards() {
        List<Card> deckList = new ArrayList<>(deck);
        Collections.shuffle(deckList);
        deck = new HashSet<>(deckList);
    }

    public void dealCards(int numPlayers) {
        int cardsPerPlayer = cardsOnTable.size() / numPlayers;
        List<Card> shuffledDeck = new ArrayList<>(deck);

        for (int i = 0; i < numPlayers; i++) {
            List<Card> playerHand = new ArrayList<>();
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerHand.add(shuffledDeck.remove(0));
            }
            System.out.println("Player " + (i + 1) + " hand: " + playerHand);
        }

        cardsOnTable.addAll(shuffledDeck);
        System.out.println("Cards on the table: " + cardsOnTable);
    }

    public static void main(String[] args) {
        Cards cardGame = new Cards();

        // Agregar cartas al juego
        cardGame.addCard(new Card("Hearts", 2));
        cardGame.addCard(new Card("Spades", 7));
        cardGame.addCard(new Card("Diamonds", 10));
        cardGame.addCard(new Card("Clubs", 5));

        // Mezclar las cartas
        cardGame.shuffleCards();

        // Repartir cartas a los jugadores
        cardGame.dealCards(3);
    }
}

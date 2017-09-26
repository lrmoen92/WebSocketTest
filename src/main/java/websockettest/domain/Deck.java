package websockettest.domain;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    Deck(){}

    Deck(boolean playingCards){
        if(playingCards) {
            List<Card> newList = new ArrayList<>();
            String[] suits = new String[]{"Hearts", "Clubs", "Spades", "Diamonds"};
            String[] values = new String[]{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 4; j++) {
                    newList.add(new Card(values[i], suits[j]));
                }
            }
            this.cards = newList;
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}

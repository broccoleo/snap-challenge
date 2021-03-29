package com.company;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

@Data
public class CardGame {
    ArrayList<Card> deckOfCards;
    LinkedList<Card> drawnCards;
    String winningMessage="You won!";

    public CardGame() {
        this.winningMessage = winningMessage;
        this.deckOfCards = new ArrayList<>();
        this.drawnCards=new LinkedList<>();
    }

    public void getInstructions() {
        System.out.println("Press enter to play");
    }

    public void getDeck() {
        for (Suit suit : Suit.values()) {
            for (Symbol symbol : Symbol.values()) {
                this.deckOfCards.add(new Card(suit, symbol));
            }
        }
    }

    public void shuffleDeck() {
            Collections.shuffle(this.deckOfCards);
    }

    public Card dealCard() {
        Card topCard = deckOfCards.get(deckOfCards.size() - 1);
        deckOfCards.remove(topCard);
        drawnCards.add(topCard);
        return topCard;
    }

    public boolean winningCondition() {
        if (deckOfCards.isEmpty()) {
            return true;
        }
        return false;
    }

    public int calculateValue (Card card) {
        HashMap<Symbol,Integer> symbolToValue = new HashMap<>();
        int value=2;
        for (Symbol symbol : Symbol.values()) {
            symbolToValue.put(symbol,value);
            value++;
        }
        return symbolToValue.get(card.getSymbol());
    }
}

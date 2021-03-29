package com.company;

import lombok.Data;

@Data
public class Card {
    private Suit suit;
    private Symbol symbol;

    public Card(Suit suit, Symbol symbol) {
        this.suit = suit;
        this.symbol = symbol;
    }
}


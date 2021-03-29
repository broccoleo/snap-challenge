package com.company;

public class CardGameFactory {
    public static CardGame getCardGame (CardGameName name) {
        switch (name) {
            case SNAP : {
                return new Snap();
            }
            case HIGHLOW : {
                return new Highlow();
            }
            case WAR : {
                return new War();
            }
            case BLACKJACK : {
                return new Blackjack();
            }
            default : {
                return null;
            }
        }
    }
}

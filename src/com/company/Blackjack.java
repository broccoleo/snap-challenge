package com.company;

public class Blackjack extends CardGame {
    public Blackjack() {
        this.winningMessage = "See you later";
    }

    @Override
    public void getInstructions() {
        System.out.println("This game is not available in your region");
    }

    @Override
    public boolean winningCondition() {
        return true;
    }
}

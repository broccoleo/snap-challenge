package com.company;

public class War extends CardGame {
    public War() {
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

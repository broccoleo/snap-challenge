package com.company;

public class Snap extends CardGame {
    public Snap() {
        this.winningMessage="Snap! You won!";
    }

    @Override
    public void getInstructions() {
        System.out.println("To play, press enter to take a card from the top deck. When two cards in a row have the same symbol, you win");
    }

    @Override
    public boolean winningCondition() {
        if (drawnCards.size()>1) {
            Symbol topCardSymbol = drawnCards.getLast().getSymbol();
            if (drawnCards.get(drawnCards.size()-2).getSymbol()==topCardSymbol) {
                return true;
            }
        }
        return false;
    }
}

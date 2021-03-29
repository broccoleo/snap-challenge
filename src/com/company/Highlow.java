package com.company;

public class Highlow extends CardGame {
    public Highlow() {
    }

    @Override
    public void getInstructions() {
        System.out.println("To play, press enter to take a card from the top deck. If the new card value is higher or lower than the previous one by at least 7 points, you win");
    }

    @Override
    public boolean winningCondition() {
        if (drawnCards.size()>1) {
            int topCardValue = calculateValue(drawnCards.getLast());
            if (Math.abs(topCardValue-(calculateValue(drawnCards.get(drawnCards.size()-2))))> 7) {
                return true;
            }
        }
        return false;
    }
}

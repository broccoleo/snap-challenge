package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        System.out.println("Welcome to the CARDSINO! Choose the game you want to play:");
        System.out.println(Arrays.asList(CardGameName.values()));

        String gameChosen = playerInput.nextLine();

        System.out.println("You chose " + gameChosen + ". Let's play...");

        CardGame game = CardGameFactory.getCardGame(CardGameName.valueOf(gameChosen));

        game.getInstructions();
        game.getDeck();
        game.shuffleDeck();

        boolean gameOver = false;

        while (!gameOver) {
            if (game.winningCondition()) {
                System.out.println(game.winningMessage);
                gameOver=true;
            } else {
                playerInput.nextLine();
                System.out.println(game.dealCard());
            }
        }
        playerInput.close();
    }
}

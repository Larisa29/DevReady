package mygame;

import mygame.player.Player;
import mygame.player.PlayerBuilder;
import mygame.player.PlayerInputReader;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final PlayerInputReader scanner;

    public Game(PlayerInputReader scanner) {
        this.scanner = scanner;
    }

    public void startRound() {
        PlayerBuilder builder = new PlayerBuilder(scanner);

        System.out.println("PLAYER 1: ");
        Player player1 = builder.createPlayer();

        System.out.println("PLAYER 2: ");
        Player player2 = builder.createPlayer();

        while (player1.getLifeScore() > 0 && player2.getLifeScore() > 0) {
            System.out.println('\n' + "------------- next atack ------------- ");
            System.out.println("Life Score for " + player1.getUserName() + ": " + player1.getLifeScore());
            System.out.println("Life Score for " + player2.getUserName() + ": " + player2.getLifeScore());

            Random random = new Random();

            // generate which player attacks
            int atacker = random.nextInt(2) + 1;
            // generate a random number from 1 to 100 for each hit; if it's <= probability, then he hit, otherwise not
            if (atacker == 1) {
                player1.attack(player2);
            } else {
                player2.attack(player1);
            }
        }

        System.out.println('\n' + "GAME OVER!");
        System.out.println("Final score for " + player1.getUserName() + ": " + player1.getLifeScore());
        System.out.println("Final score for " + player2.getUserName() + ": " + player2.getLifeScore());
        if (player1.getLifeScore() > player2.getLifeScore()) {
            System.out.println("Player " + player1.getUserName() + " has won. Congrats!");
        } else {
            System.out.println("Player " + player2.getUserName() + " has won. Congrats!");
        }
    }
}
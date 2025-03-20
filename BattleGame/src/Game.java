import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public Weapons chooseWeapon(Player player) {
        System.out.println(player.getUserName() + ", please select your weapon. The available weapons are: ");
        for (Weapons weapon : Weapons.values()) {
            System.out.print(weapon + ", ");
        }
        String weapon = "";
        while (!isValidWeapon(weapon)) {
            System.out.println("\nYou have to read a weapon from the given list..  ");
            Scanner myObj = new Scanner(System.in);
            weapon = myObj.nextLine();
        }
        player.setWeapon(weapon);

        return player.getWeapon();
    }

    public static boolean isValidWeapon(String weapon) {
        try {
            Weapons.valueOf(weapon);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public void startRound() {
        int currentLifeScore;
        while (player1.getLifeScore() > 0 && player2.getLifeScore() > 0) {
            System.out.println('\n' + "------------- next atack ------------- ");
            System.out.println("Life Score for player1: " + player1.getLifeScore());
            System.out.println("Life Score for player2: " + player2.getLifeScore());

            Random random = new Random();

            //sa generez cumva random cine pe cine loveste
            int atacker = random.nextInt(2) + 1;
            System.out.println("Current Atacker: player" + atacker);
            //sa generez random un nr de la 1 la 100 pt fiecare lovitura; daca e <= sansa atunci l-a nimerit, altfel nu
            int randomChance = random.nextInt(100) + 1;
            System.out.println("(RANDOM) Chance to hit the enemy: " + randomChance);
            if (atacker == 1) {//scad din viata lui player2
                System.out.println("The actual chance to hit with player1's weapon is " + player1.getWeapon().getProbability());
                if (randomChance <= player1.getWeapon().getProbability()) {
                    System.out.println("You struck him straight in the heart! The remaining life score for player2 is: " + player2.getLifeScore() + "-" + player1.getWeapon().getDamage() + " =" + (player2.getLifeScore() - player1.getWeapon().getDamage()));
                    currentLifeScore = player2.getLifeScore() - player1.getWeapon().getDamage();
                    if (currentLifeScore < 0) {
                        player2.setLifeScore(0);
                    } else {
                        player2.setLifeScore(currentLifeScore);
                    }
                } else {
                    System.out.println("You missed..maybe next time you'll hit the opponent");
                }
            } else {
                //inseamna ca a lovit celalalt, ADICA player2, deci tre sa scad din viata lui player1
                System.out.println("The actual chance to hit with player2's weapon is " + player2.getWeapon().getProbability());
                if (randomChance <= player2.getWeapon().getProbability()) {
                    System.out.println("You struck him straight in the heart! The remaining life score for player1 is: " + player1.getLifeScore() + "-" + player2.getWeapon().getDamage() + " =" + (player1.getLifeScore() - player2.getWeapon().getDamage()));
                    currentLifeScore = player1.getLifeScore() - player2.getWeapon().getDamage();
                    if (currentLifeScore < 0) {
                        player1.setLifeScore(0);
                    } else {
                        player1.setLifeScore(currentLifeScore);
                    }
                } else {
                    System.out.println("You missed..maybe next time you'll hit the opponent");
                }
            }
        }
        System.out.println('\n' + "GAME OVER!");
        //daca e mai mic ca 0, s afisez viata cu 0
        System.out.println("Final score for " + player1.getUserName() + ": " + player1.getLifeScore());
        System.out.println("Final score for " + player2.getUserName() + ": " + player2.getLifeScore());
        if (player1.getLifeScore() > player2.getLifeScore()) {
            System.out.println("Player " + player1.getUserName() + " has won. Congrats!");
        } else {
            System.out.println("Player " + player2.getUserName() + " has won. Congrats!");
        }
    }
}
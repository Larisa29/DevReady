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
        while (player1.getLifeScore() > 0 && player2.getLifeScore() > 0) {
            System.out.println("Life Score for player1: " + player1.getLifeScore());
            System.out.println("Life Score for player2: " + player2.getLifeScore());

            Random random = new Random();

            //sa generez cumva random cine pe cine loveste
            int atacker = random.nextInt(2) + 1;
            System.out.println("Current Atacker: player" + atacker);
            //sa generez random un nr de la 1 la 100 pt fiecare lovitura; daca e <= sansa atunci l-a nimerit, altfel nu
            int randomChance = random.nextInt(100) + 1;
            System.out.println("Chance to hit the enemy is: " + randomChance);
            if (atacker == 1) {//scad din viata lui player2
                System.out.println("The actual chance to hit using the player1's weapon is " + player1.getWeapon().getProbability());
                if (randomChance <= player1.getWeapon().getProbability()) {
                    player2.setLifeScore(player2.getLifeScore() - player2.getWeapon().getDamage());
                    //System.out.println("Li");
                }
            } else {
                //inseamna ca a lovit celalalt player, deci tre sa scad din viata lui player1
                if (randomChance <= player1.getWeapon().getProbability()) {
                    player1.setLifeScore(player1.getLifeScore() - player1.getWeapon().getDamage());
                }
            }

            System.out.println("------------- next atack --------------------");
        }
    }
}

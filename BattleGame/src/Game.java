import java.util.Random;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public void attack(Player attacker, Player enemy, int chanceToHit) {
        int currentLifeScore;
        System.out.println("Current atacker: " + attacker.getUserName());
        attacker.getWeapon().useWeapon();
        System.out.println("The actual chance to hit with attacker's weapon is " + attacker.getWeapon().getProbability());
        if (chanceToHit <= attacker.getWeapon().getProbability()) {
            currentLifeScore = enemy.getLifeScore() - attacker.getWeapon().getDamage();
            System.out.println("You struck him straight in the heart! The remaining life score for " + enemy.getUserName() + " is: " + enemy.getLifeScore() + "-" + attacker.getWeapon().getDamage() + " =" + currentLifeScore);

            //if the value is less than 0, then set it to 0
            enemy.setLifeScore(Math.max(0, currentLifeScore));
        } else {
            System.out.println("You missed..maybe next time you'll hit the opponent");
        }
    }

    public void startRound() {
        while (player1.getLifeScore() > 0 && player2.getLifeScore() > 0) {
            System.out.println('\n' + "------------- next atack ------------- ");
            System.out.println("Life Score for " + player1.getUserName() + ": " + player1.getLifeScore());
            System.out.println("Life Score for " + player2.getUserName() + ": " + player2.getLifeScore());

            Random random = new Random();

            // generate which player attacks
            int atacker = random.nextInt(2) + 1;
            // generate a random number from 1 to 100 for each hit; if it's <= probability, then he hit, otherwise not
            int randomChance = random.nextInt(100) + 1;
            System.out.println("(RANDOM) Chance to hit the enemy: " + randomChance);
            if (atacker == 1) {
                attack(player1, player2, randomChance);
            } else {
                attack(player2, player1, randomChance);
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
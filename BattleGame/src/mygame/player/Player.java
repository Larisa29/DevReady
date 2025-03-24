package mygame.player;

import mygame.weapons.Weapon;

import java.util.Objects;

public class Player {
    private int lifeScore = 100;
    private final String userName;
    private final Weapon weapon;

    public Player(String userName, Weapon weapon) {
        this.userName = userName;
        this.weapon = weapon;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getLifeScore() {
        return this.lifeScore;
    }

    public void attack(Player enemy) {
        System.out.println("Current atacker: " + this.userName);
        System.out.println("The actual chance to hit with attacker's weapon is " + this.weapon.getProbability());
        if (this.weapon.isAHit()) {
            enemy.takeDamage(this.weapon);
        } else {
            System.out.println("You missed..maybe next time you'll hit the opponent");
        }
    }

    private void takeDamage(Weapon weapon) {
        this.weapon.useWeapon();
        int currentLifeScore = this.getLifeScore() - weapon.getDamage();
        System.out.println("You struck him straight in the heart! The remaining life score for " + this.userName + " is: " + this.lifeScore + "-" + weapon.getDamage() + " =" + currentLifeScore);

        //if the value is less than 0, then set it to 0
        this.lifeScore = (Math.max(0, currentLifeScore));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return lifeScore == player.lifeScore && Objects.equals(userName, player.userName) && Objects.equals(weapon, player.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifeScore, userName, weapon);
    }
}



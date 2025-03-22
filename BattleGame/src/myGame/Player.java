package myGame;

import java.util.Scanner;

public class Player {
    private int lifeScore = 100;
    private String userName;
    private Weapons weapon;
    private Scanner scanner;

    public Player(Scanner scanner){
        this.scanner = scanner;
    }

    public void setName() {
        String inputName="";
        while (inputName.isEmpty())
        {
            System.out.println("Enter a valid name..");
            inputName = scanner.nextLine().trim();
        }
        this.userName = inputName;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getLifeScore() {
        return this.lifeScore;
    }

    public void setLifeScore(int newScore) {
        this.lifeScore = newScore;
    }

    public Weapons getWeapon() {
        return this.weapon;
    }

    public void chooseWeapon() {
        System.out.println(this.userName + ", please select your weapon. The available weapons are: ");
        for (Weapons weapon : Weapons.values()) {
            System.out.print(weapon + ", ");
        }
        String weapon = "";
        while (!Weapons.isValidWeapon(weapon)) {
            System.out.println("\nYou have to read a weapon from the given list..  ");
            weapon = scanner.nextLine();
        }
        this.weapon = Weapons.valueOf(weapon);
    }
}



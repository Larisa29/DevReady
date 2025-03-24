package mygame.player;

import mygame.weapons.Weapon;
import mygame.weapons.WeaponChoice;
import mygame.weapons.WeaponFactory;

import java.util.Scanner;

public class PlayerBuilder {
    private final PlayerInputReader scanner;

    public PlayerBuilder(PlayerInputReader scanner){
        this.scanner = scanner;
    }

    public Player createPlayer() {
        String inputName = readUsername();
        String weaponInput = readWeapon();
        Weapon weapon = WeaponFactory.getWeapon(weaponInput);

        return new Player(inputName, weapon);
    }

    private String readWeapon() {
        for (WeaponChoice weapon : WeaponChoice.values()) {
            System.out.print(weapon + ", ");
        }
        String weapon = "";
        while (!isValidWeapon(weapon)) {
            System.out.println("\nYou have to read a weapon from the given list..  ");
            weapon = this.scanner.read();
        }
        return weapon;
    }

    private String readUsername() {
        String inputName = "";
        while (inputName.isEmpty()) {
            System.out.println("Enter a valid name..");
            inputName = this.scanner.read().trim();
        }
        return inputName;
    }

    private boolean isValidWeapon(String weapon) {
        try {
            WeaponChoice.valueOf(weapon);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

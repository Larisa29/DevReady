package mygame.player;

import mygame.weapons.Weapon;
import mygame.weapons.WeaponFactory;

public class PlayerBuilderTest {
    public static void main(String[] args) {
        String userName = "Ionel";
        String weaponName = "KATANA";
        PlayerInputReader scanner = new MockPlayerInputReader(userName, weaponName);
        PlayerBuilder playerBuilder = new PlayerBuilder(scanner);
        Player playerActual = playerBuilder.createPlayer();
        Weapon expectedWeapon = WeaponFactory.getWeapon(weaponName);
        Player playerExpected = new Player(userName, expectedWeapon);
        System.out.println(playerActual.equals(playerExpected));
    }
}

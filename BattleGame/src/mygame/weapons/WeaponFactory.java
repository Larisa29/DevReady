package mygame.weapons;

public class WeaponFactory {
    public static Weapon getWeapon(String weapon) {
        try {
            WeaponChoice weaponChoice = WeaponChoice.valueOf(weapon);
            switch (weaponChoice) {
                case SWORD -> {
                    return new Sword();
                }
                case PEPPER_SPRAY -> {
                    return new PepperSpray();
                }
                case KATANA -> {
                    return new Katana();
                }
                case REVOLVER -> {
                    return new Revolver();
                }
                default -> {
                    return null;
                }
            }
        } catch (IllegalArgumentException ex) {
            return null;
        }
    }
}

public enum Weapons {
    PEPPER_SPRAY(5, 35),
    KNIFE(25, 70),
    AXE(30, 35),
    SWORD(45, 78),
    SPEAR(18, 44),
    KATANA(55, 65),
    REVOLVER(45, 25),
    PISTOL(35, 30);

    private int damage;
    private int probability;

    Weapons(int damage, int probability) {
        this.damage = damage;
        this.probability = probability;
    }

    public int getProbability() {
        return this.probability;
    }

    public int getDamage() {
        return this.damage;
    }

    public static boolean isValidWeapon(String weapon) {
        try {
            Weapons.valueOf(weapon);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

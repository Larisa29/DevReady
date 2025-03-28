package mygame.weapons;

class Katana extends Weapon {
    Katana() {
        super(55, 65, new RandomHitDetection());
    }

    @Override
    public void useWeapon() {
        System.out.println("........Swinging the katana!........");
    }
}

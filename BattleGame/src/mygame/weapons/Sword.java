package mygame.weapons;

class Sword extends Weapon {
    Sword() {
        super(45, 78, new RandomHitDetection());
    }

    @Override
    public void useWeapon() {
        System.out.println("........Swinging the sword!........");
    }
}
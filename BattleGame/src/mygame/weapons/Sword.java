package mygame.weapons;

class Sword extends Weapon {
    Sword() {
        super(45, 78);
    }

    @Override
    public void useWeapon() {
        System.out.println("........Swinging the sword!........");
    }
}
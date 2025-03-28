package mygame.weapons;

class Revolver extends Weapon{
    Revolver() {
        super(45, 25, new RandomHitDetection());
    }

    @Override
    public void useWeapon() {
        System.out.println("........Firing the revolver!........");
    }
}

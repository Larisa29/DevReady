package mygame.weapons;

class Revolver extends Weapon{
    Revolver() {
        super(45, 25);
    }

    @Override
    public void useWeapon() {
        System.out.println("........Firing the revolver!........");
    }
}

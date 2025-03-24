package mygame.weapons;

class PepperSpray extends Weapon {
    PepperSpray() {
        super(15, 77);
    }

    @Override
    public void useWeapon() {
        System.out.println("........Spraying pepper spray!........");
    }
}

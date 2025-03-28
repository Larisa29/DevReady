package mygame.weapons;

import java.util.Objects;

public abstract class Weapon {
    private int damage;
    private int probability;
    private final RandomHitDetection hitDetection;

    protected Weapon(int damage, int probability, RandomHitDetection hitDetection) {
        this.damage = damage;
        this.probability = probability;
        this.hitDetection = hitDetection;
    }

    public int getProbability() {
        return this.probability;
    }

    public int getDamage() {
        return this.damage;
    }

    //I can establish in different ways if there is a hit -> hitDetection
    public boolean isAHit() {
        return this.hitDetection.isAHit(this.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return damage == weapon.damage && probability == weapon.probability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage, probability);
    }

    public abstract void useWeapon();
}

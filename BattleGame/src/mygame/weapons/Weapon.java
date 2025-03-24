package mygame.weapons;

import java.util.Objects;
import java.util.Random;

public abstract class Weapon {
    private int damage;
    private int probability;

    Weapon(int damage, int probability) {
        this.damage = damage;
        this.probability = probability;
    }

    public int getProbability() {
        return this.probability;
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean isAHit() {
        Random random = new Random();
        int randomChance = random.nextInt(100) + 1;
        System.out.println("(RANDOM) Chance to hit the enemy: " + randomChance);

        return randomChance <= this.probability;
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

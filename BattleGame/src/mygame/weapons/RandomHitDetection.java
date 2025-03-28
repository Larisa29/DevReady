package mygame.weapons;

import java.util.Random;

public class RandomHitDetection implements HitDetection{
    private final Random random = new Random();

    @Override
    public boolean isAHit(int probability) {
        int randomChance = random.nextInt(100) + 1;
        System.out.println("Computed chance to hit the enemy: " + randomChance);

        return randomChance <= probability;
    }
}

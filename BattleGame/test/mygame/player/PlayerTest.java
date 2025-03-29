package mygame.player;

import mygame.weapons.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PlayerTest {
    @Test
    public void attack_playerHitsEnemyIsTrue_enemyScoreLifeIsDecreased(){
        //Arrange
        Weapon mockWeapon = mock(Weapon.class);
        when(mockWeapon.isAHit()).thenReturn(true);
        when(mockWeapon.getDamage()).thenReturn(30);

        Player attacker = new Player("Attacker", mockWeapon);
        Player enemy = new Player("Enemy", mockWeapon);

        int enemyInitialLife = enemy.getLifeScore();

        //Act
        attacker.attack(enemy);

        //Assert
        assertEquals(enemyInitialLife - 30, enemy.getLifeScore());
    }

    @Test
    public void attack_playerHitsEnemyIsFalse_enemyScoreLifeIsUnchanged(){
        //Arrange
        Weapon mockWeapon = mock(Weapon.class);
        when(mockWeapon.isAHit()).thenReturn(false);

        Player attacker = new Player("Attacker", mockWeapon);
        Player enemy = new Player("Enemy", mockWeapon);

        //Act
        attacker.attack(enemy);

        //Assert
        assertEquals(100, enemy.getLifeScore());
    }
}

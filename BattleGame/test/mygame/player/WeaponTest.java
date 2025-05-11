package mygame.player;

import mygame.weapons.RandomHitDetection;
import mygame.weapons.Weapon;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class WeaponTest {
    @Test
    public void isAHit_weaponDelegatesToHitDetection() {
        //Arrange
        RandomHitDetection mockDetection = Mockito.mock(RandomHitDetection.class);
        when(mockDetection.isAHit(40)).thenReturn(true);

        Weapon weapon = new Weapon(10, 40, mockDetection) {
            @Override
            public void useWeapon() {
            }
        };

        //Act
        boolean result = weapon.isAHit();

        //Assert
        assertTrue(result);
        verify(mockDetection).isAHit(40);
    }
}

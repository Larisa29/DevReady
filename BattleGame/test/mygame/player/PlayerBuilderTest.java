package mygame.player;

import mygame.weapons.Weapon;
import mygame.weapons.WeaponFactory;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PlayerBuilderTest {
    @Test
    public void createPlayer_validName_playerIsSetCorrectly() {
        //Arrange
        PlayerInputReader mockInputReader = mock(PlayerInputReader.class);
        Weapon mockWeapon = mock(Weapon.class);

        when(mockInputReader.read())
                .thenReturn("  ")
                .thenReturn("")
                .thenReturn("Lary")
                .thenReturn("")
                .thenReturn("SWORD");

        try (MockedStatic<WeaponFactory> mockWeaponFactory = mockStatic(WeaponFactory.class)) {
            mockWeaponFactory.when(() -> WeaponFactory.getWeapon("SWORD")).thenReturn(mockWeapon);

            PlayerBuilder playerBuilder = new PlayerBuilder(mockInputReader);

            //Act
            Player player = playerBuilder.createPlayer();

            //Assert
            assertNotNull(player);
            assertEquals("Lary", player.getUserName());
            assertEquals(mockWeapon, player.getWeapon());
        }
    }
}

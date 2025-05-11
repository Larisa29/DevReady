//package test;
//
//import myGame.Game;
//import myGame.Player;
//import myGame.Weapons;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.Random;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class UnitTests {
//    /* PLAYER CLASS*/
//    private void provideInput(String data) {
//        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
//        System.setIn(testIn);
//    }
//
//    @Test
//    void setName_validName_setsNameCorrectly() {
//        //Arrange
//        provideInput("Aurel");
//        Scanner scanner = new Scanner(System.in);
//        Player player = new Player(scanner);
//
//        //Act
//        player.setName();
//
//        //Assert
//        assertEquals("Aurel", player.getUserName());
//    }
//
//    @Test
//    void chooseWeapon_validInput_isChosen() {
//        //arrange
//        provideInput("SWORD");
//        Scanner scanner = new Scanner(System.in);
//        Player player = new Player(scanner);
//
//        //act
//        player.chooseWeapon();
//
//        //assert
//        assertEquals(Weapons.SWORD, player.getWeapon());
//    }
//
//    @Test
//    void chooseWeapon_invalidWeapon_thenValid_isChosen() {
//        //arrange
//        provideInput("bici\narbaleta\nKATANA");
//        Scanner scanner = new Scanner(System.in);
//        Player player = new Player(scanner);
//
//        //act
//        player.chooseWeapon();
//
//        //assert
//        assertEquals(Weapons.KATANA, player.getWeapon());
//    }
//
//    /* WEAPONS*/
//    @Test
//    void isValidWeapon_validWeapon_returnsTrue() {
//        //Arrange
//        String validWeapon = "AXE";
//
//        //Act
//        boolean isValid = Weapons.isValidWeapon(validWeapon);
//
//        //Assert
//        assertTrue(isValid);
//    }
//
//    @Test
//    void isValidWeapon_invalidWeapon_returnsFalse() {
//        //Arrange
//        String invalidWeapon = "bici";
//
//        //Act
//        boolean isValid = Weapons.isValidWeapon(invalidWeapon);
//
//        //Assert
//        assertFalse(isValid);
//    }
//
//    /*GAME class*/
//    @Test
//    void attack_playerHitsEnemy_enemyScoreLifeIsDecreased() {
//        //Arrange
//        provideInput("Kornel\nDaciana\nKATANA\nKNIFE");
//        Scanner scanner = new Scanner(System.in);
//        Player attacker = new Player(scanner);
//        Player enemy = new Player(scanner);
//        attacker.chooseWeapon();
//        enemy.chooseWeapon();
//        Game game = new Game(attacker, enemy);
//        int lifeScoreBeforeAttack = enemy.getLifeScore();
//        Random random = new Random();
//        //ceva mai mic ca attacker.getWeapon().getProbability() ca sa fiu sigura ca nimereste inamicul
//        int chanceToHit = random.nextInt(attacker.getWeapon().getProbability()) + 1;
//
//        //Act
//        game.attack(attacker, enemy, chanceToHit);
//
//        //Assert
//        assertEquals((lifeScoreBeforeAttack - attacker.getWeapon().getDamage()), enemy.getLifeScore());
//    }
//
//    @Test
//    void attack_playerDoesntHitEnemy_missedShotMessageDisplayed() {
//        //Arrange
//        provideInput("Kornel\nDaciana\nKATANA\nKNIFE");
//        Scanner scanner = new Scanner(System.in);
//        Player attacker = new Player(scanner);
//        Player enemy = new Player(scanner);
//        attacker.chooseWeapon();
//        enemy.chooseWeapon();
//        Game game = new Game(attacker, enemy);
//        Random random = new Random();
//        //ceva mai MARE ca attacker.getWeapon().getProbability() ca sa fiu sigura ca NU nimereste inamicul: (max-min) + min
//        int chanceToHit = random.nextInt(100 - attacker.getWeapon().getProbability()) + attacker.getWeapon().getProbability();
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream originalOut = System.out;
//        System.setOut(new PrintStream(outputStream));
//
//        //Act
//        game.attack(attacker, enemy, chanceToHit);
//
//        //Assert
//        System.setOut(originalOut);
//        String output = outputStream.toString();
//        assertTrue(output.contains("You missed..maybe next time you'll hit the opponent"));
//    }
//}

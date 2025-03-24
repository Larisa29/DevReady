package mygame.player;

import java.util.Scanner;

public class KeyboardPlayerInputReader implements PlayerInputReader{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine().trim();
    }
}

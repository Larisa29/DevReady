package mygame;
//Sa construim un joculet care sa citeasca de la tastatura :numele jucatorului. Jucatorul
// are 100 viata. Apoi pe rand fiecare jucator isi va selecta arma si va trage in adversar.
// Jocul se termina cand un adversare ajunge cu viata <=0. Puteti sa definiti voi armele.
// Fiecare arma are o sanse de a nimeri jucatorul advers si un damage.Ex cutit(10, 100%),
// pistol(20, 50%), ak47(50, 20%). La fiecare runda jucatorul poate selecta alta arma
//la final, trebuie afisat numele jucatorului castigator si viata cu care a ramas

import mygame.player.KeyboardPlayerInputReader;
import mygame.player.Player;
import mygame.player.PlayerBuilder;
import mygame.player.PlayerInputReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerInputReader scanner = new KeyboardPlayerInputReader();
        Game battleGame = new Game(scanner);
        battleGame.startRound();
    }
}
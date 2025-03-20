//Sa construim un joculet care sa citeasca de la tastatura :numele jucatorului. Jucatorul
// are 100 viata. Apoi pe rand fiecare jucator isi va selecta arma si va trage in adversar.
// Jocul se termina cand un adversare ajunge cu viata <=0. Puteti sa definiti voi armele.
// Fiecare arma are o sanse de a nimeri jucatorul advers si un damage.Ex cutit(10, 100%),
// pistol(20, 50%), ak47(50, 20%). La fiecare runda jucatorul poate selecta alta arma
//la final, trebuie afisat numele jucatorului castigator si viata cu care a ramas

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        System.out.println("Enter the username for PLAYER 1: ");
        player1.setName();
        //player1.chooseWeapon();

        Player player2 = new Player();
        System.out.println("Enter the username for PLAYER 2: ");
        player2.setName();
        //player2.chooseWeapon();

        Game battleGame = new Game(player1, player2);
        battleGame.chooseWeapon(player1);
        battleGame.chooseWeapon(player2);

        battleGame.startRound();
    }
}
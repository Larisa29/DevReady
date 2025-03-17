import java.util.Scanner;

public class Player {
    private int lifeScore = 100;
    private String userName;
    private Weapons weapon;

    public void setName() {
        Scanner myObj = new Scanner(System.in);
        this.userName = myObj.nextLine();
    }

    public String getUserName() {
        return this.userName;
    }

    public int getLifeScore(){
        return this.lifeScore;
    }

    public void setLifeScore(int newScore){
        this.lifeScore = newScore;
    }

    public void setWeapon(String weapon) {
        this.weapon = Weapons.valueOf(weapon);
    }

    public Weapons getWeapon() {
        return this.weapon;
    }

    //    public String chooseWeapon() {
//        System.out.println(this.userName+ ", please select your weapon. The available weapons are: ");
//        for (Weapons weapon : Weapons.values()) {
//            System.out.print(weapon + ", ");
//        }
//        String weapon = "";
//        while (!isValidWeapon(weapon)) {
//            System.out.println("\nYou have to read a weapon from the given list..  ");
//            Scanner myObj = new Scanner(System.in);
//            weapon = myObj.nextLine();
//        }
//        this.weapon = weapon;
//
//        return this.weapon;
//    }
//
//    public static boolean isValidWeapon(String weapon) {
//        try {
//            Weapons.valueOf(weapon);
//            return true;
//        } catch (IllegalArgumentException e) {
//            return false;
//        }
    }




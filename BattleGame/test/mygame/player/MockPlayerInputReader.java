package mygame.player;

class MockPlayerInputReader implements PlayerInputReader {
    private int counter = 0;
    private final String userName;
    private final String weaponName;

    MockPlayerInputReader(String userName, String weapon) {
        this.userName = userName;
        this.weaponName = weapon;
    }

    @Override
    public String read() {
        counter++;
        return counter == 1 ? this.userName : this.weaponName;
    }
}

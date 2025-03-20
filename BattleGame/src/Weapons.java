public enum Weapons {
    PEPPER_SPRAY(5, 35) {
        @Override
        public void useWeapon() {
            System.out.println("........Spraying pepper spray!........");
        }
    },
    KNIFE(25, 70) {
        @Override
        public void useWeapon() {
            System.out.println("........Slashing with the knife!........");
        }
    },
    AXE(30, 35) {
        @Override
        public void useWeapon() {
            System.out.println("........Chopping with the axe!........");
        }
    },
    SWORD(45, 78) {
        @Override
        public void useWeapon() {
            System.out.println("........Swinging the sword!........");
        }
    },
    SPEAR(18, 44) {
        @Override
        public void useWeapon() {
            System.out.println("........Thrusting the spear!........");
        }
    },
    KATANA(55, 65) {
        @Override
        public void useWeapon() {
            System.out.println("........Swinging the katana!........");
        }
    },
    REVOLVER(45, 25) {
        @Override
        public void useWeapon() {
            System.out.println("........Firing the revolver!........");
        }
    },
    PISTOL(35, 30) {
        @Override
        public void useWeapon() {
            System.out.println("........Shooting with the pistol!........");
        }
    };

    private int damage;
    private int probability;

    Weapons(int damage, int probability) {
        this.damage = damage;
        this.probability = probability;
    }

    public abstract void useWeapon();

    public int getProbability() {
        return this.probability;
    }

    public int getDamage() {
        return this.damage;
    }

    public static boolean isValidWeapon(String weapon) {
        try {
            Weapons.valueOf(weapon);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

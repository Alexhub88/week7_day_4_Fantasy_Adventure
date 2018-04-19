public enum Weapon {

    SWORD(20),
    AXE(15),
    CLUB(5);

    private int damage;


    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }


}





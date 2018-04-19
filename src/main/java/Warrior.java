public abstract class Warrior extends Player implements IFightable {

    private Weapon weapon;

    public Warrior(String name, int healthPoints, Weapon weapon){
        super(name, healthPoints);
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void pickFight(Enemy enemy){
        enemy.decreaseHealthPoints(getWeapon().getDamage());
    }
}

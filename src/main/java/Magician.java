public abstract class Magician extends Player implements ISpellable{

    private Spell spell;

    public Magician(String name, int healthPoints, Spell spell) {
        super(name, healthPoints);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void castSpell(Enemy enemy){
        enemy.decreaseHealthPoints(getSpell().getSpellDamage());
    }
}

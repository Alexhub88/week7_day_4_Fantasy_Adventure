public class Wizard extends Magician {

    private Dragon dragon;

    public Wizard(String name, int healthPoints, Spell spell, Dragon dragon) {
        super(name, healthPoints, spell);
        this.dragon = dragon;
    }


}

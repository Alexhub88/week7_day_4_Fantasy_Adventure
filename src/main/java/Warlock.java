public class Warlock extends Magician {

    private Ogre ogre;

    public Warlock(String name, int healthPoints, Spell spell, Ogre ogre) {
        super(name, healthPoints, spell);
        this.ogre = ogre;
    }

    public Ogre getOgre() {
        return ogre;
    }
}

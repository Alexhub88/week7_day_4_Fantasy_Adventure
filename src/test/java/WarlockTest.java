import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock1;
    private Ogre ogre1;

    @Before
    public void before(){
        ogre1 = new Ogre();
        warlock1 = new Warlock("Saruman", 60, Spell.FREEZE, ogre1);
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.FREEZE, warlock1.getSpell());
    }

    @Test
    public void hasOgre(){
        assertEquals( Ogre.class, warlock1.getOgre().getClass());
    }

}

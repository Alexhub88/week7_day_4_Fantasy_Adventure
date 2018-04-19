import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight1;

    @Before
    public void before(){
        knight1 = new Knight("Arthur", 5000, Weapon.SWORD);
    }

    @Test
    public void hadName(){
        assertEquals("Arthur", knight1.getName());

    }

    @Test
    public void hasHealthPoints(){
        assertEquals(5000, knight1.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SWORD, knight1.getWeapon());
    }

}

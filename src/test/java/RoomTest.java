import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    Room room2;
    Orc orc1;
    Dwarf dwarf1;
    Cleric cleric1;
    Wizard wizard1;
    Dragon dragon1;

    @Before
    public void before(){
        cleric1 = new Cleric("Bonzo", 80, HealingTools.HERBS);
        dwarf1 = new Dwarf("Gimly", 50, Weapon.AXE);
        orc1 = new Orc("Jim", 40);
        room1 = new Room(Treasure.DIAMONDS, orc1, dwarf1);
        wizard1 = new Wizard("Bill", 100, Spell.FREEZE, dragon1);
    }

    @Test
    public void canFight(){
        dwarf1.pickFight(orc1);
        assertEquals(25, orc1.getHealthPoints());
    }

    @Test
    public void canHeal(){
        cleric1.heal(dwarf1);
        assertEquals(70, dwarf1.getHealthPoints());

    }

    @Test
    public void canSpell(){
        wizard1.castSpell(orc1);
        assertEquals(20, orc1.getHealthPoints());

    }
}

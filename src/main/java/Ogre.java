public class Ogre implements IHealable {

    public Ogre() {
    }

    public void heal(Player player){
        player.increaseHealthPoints(30);
    }
}

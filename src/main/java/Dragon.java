public class Dragon implements IHealable {

    public Dragon() {
    }

    public void heal(Player player){
        player.increaseHealthPoints(30);
    }
}

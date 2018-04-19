public class Room {

    private Treasure treasure;
    private Enemy enemy;
    private Player player;

    public Room(Treasure treasure, Enemy enemy, Player player) {
        this.treasure = treasure;
        this.enemy = enemy;
        this.player = player;
    }
}

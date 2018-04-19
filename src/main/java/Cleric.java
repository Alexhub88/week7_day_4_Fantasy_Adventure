public class Cleric extends Player implements IHealable{

    private HealingTools healingTools;

    public Cleric(String name, int healthPoints, HealingTools healingTools) {
        super(name, healthPoints);
        this.healingTools = healingTools;
    }

    public void heal(Player player){
        player.increaseHealthPoints(healingTools.getHealingValue());
    }

}

public enum HealingTools {

    HERBS(20),
    POTIONS(50),
    UNGUENTS(100);

    private int healingValue;

    HealingTools(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}

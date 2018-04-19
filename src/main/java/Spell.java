public enum Spell {

    FIREBALL(45),
    LIGHTNING(100),
    FREEZE(20);

    private int spellDamage;

    Spell(int spellDamage){
        this.spellDamage = spellDamage;
    }

    public int getSpellDamage(){
        return this.spellDamage;
    }
}

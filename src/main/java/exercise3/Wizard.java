package exercise3;

class Wizard extends Player {
    private String spell;

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    //Getters
    public String getSpell() {
        return spell;
    }

    //Methods
    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), 0);
    }
}

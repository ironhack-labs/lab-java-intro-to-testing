package com.ironhack.videoGame;

public class Wizard extends Player {
    private int spell;

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public Elf convertToElf () {
        return new Elf(this.getHealth(), this.getStrength(), this.getLives(), this.spell);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "spell=" + spell +
                "} " + super.toString();
    }
}

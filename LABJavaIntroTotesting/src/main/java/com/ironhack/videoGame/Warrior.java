package com.ironhack.videoGame;

public class Warrior extends Player{
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }
    public Elf convertToElf() {
        return new Elf (this.getHealth(), this.getStrength(), this.getLives(), this.force);

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "force=" + force +
                "} " + super.toString();
    }
}

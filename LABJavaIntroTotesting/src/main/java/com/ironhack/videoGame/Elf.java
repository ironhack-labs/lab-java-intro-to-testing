package com.ironhack.videoGame;

public class Elf extends Player{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}

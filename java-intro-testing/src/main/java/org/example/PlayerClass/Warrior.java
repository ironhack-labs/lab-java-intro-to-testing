package org.example.PlayerClass;

public class Warrior extends Player {
    private int force;
    final private int initialHealth;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        setForce(force);
        initialHealth = health;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void decrementLive() {
        setHealth(initialHealth);
        super.setLives(super.getLives() - 1);
        if (getLives() <= 0) {
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - getStrength());
    }

    public void checkHealth() {
        if(getHealth()<=0){
            decrementLive();
        }
    }

    public Elf convertToElf () {
        Elf elf = new Elf(getHealth(), getStrength(), getLives(), getForce());
        return elf;
    }
}

package org.example.PlayerClass;

public class Elf extends Player{
    private int speed;
    final private int initialHealth;
    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        setSpeed(speed);
        initialHealth = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void decrementLive() {
        setHealth(initialHealth);
        super.setLives(super.getLives()-1);
        if(getLives()<=0){
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth()-getStrength());
    }

    public void checkHealth() {
        if(getHealth()<=0){
            decrementLive();
        }
    }
}

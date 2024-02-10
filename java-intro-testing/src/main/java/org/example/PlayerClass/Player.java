package org.example.PlayerClass;

abstract public class Player {
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    abstract public void decrementLive();

    abstract public void attack(Player playerToAttack);

    abstract public void checkHealth();

}

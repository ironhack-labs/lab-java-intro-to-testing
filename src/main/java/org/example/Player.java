package org.example;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int originalHealth;


    // Constructor
    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
        originalHealth = health;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    // Getters
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    // method that decrements the lives by 1 and restores the health to its original value.
    // If lives are less than or equal to 0, print "This character is dead".
    public void decrementLive() {
        if (lives <= 0) {
            System.out.println("This character is dead");
        } else {
            setLives(lives-1);
            setHealth(originalHealth);
        }
    }

    // method that decrements the health of the player passed as an argument by the strength of the current player.
    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth()-strength);
        playerToAttack.checkHealth();
    }

    // method that checks if the current player's health is less than or equal to 0
    // if yes, calls decrementLive() method.
    public void checkHealth() {
       if (health <= 0) {
           decrementLive();
       }
    }
}
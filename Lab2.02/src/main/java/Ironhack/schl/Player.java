package Ironhack.schl;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;

    //Constructor

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    // Getters and setters

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLive() {
        lives--;
        if (lives > 0) {
            restoreHealth();
            System.out.println("You have " + lives + " lives left");
        } else {
            System.out.println("This character died.");
        }
    }

    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }

    public void restoreHealth() {
        this.health = 100;

    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - strength);
    }

}
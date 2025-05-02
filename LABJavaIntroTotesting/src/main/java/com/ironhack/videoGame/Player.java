package com.ironhack.videoGame;

public class Player {
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLives() {
        if (this.lives > 0) {
            this.lives--;
            this.health = 100; //Restore the health
        }
    }

    public void checkHealth() {
        if (this.health <= 0) {
            this.decrementLives();
        }
    }

    public String attack(Player playerToAttack) {

        if (this.strength <= 0) {
            return "This player cannot attack, doesn't have any strength";
        }
        if (playerToAttack.getLives() <= 0) {
            return "The player " + playerToAttack + " is dead";
        }

        int newHealth = playerToAttack.getHealth() - this.strength;
        playerToAttack.setHealth(newHealth);
        playerToAttack.checkHealth();
        playerToAttack.checkHealth();

        if (playerToAttack.getLives() <= 0) {
            return playerToAttack + " is dead!";
        } else {
            return "damage has occurred " + playerToAttack + " health: " + playerToAttack.getHealth();
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", lives=" + lives +
                '}';
    }
}



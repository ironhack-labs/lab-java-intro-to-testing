public abstract class Player {
    private int health;
    private int originalHealth;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.originalHealth = health;  // Store the original health
        this.strength = strength;
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

    // Method to decrement lives and restore health
    public void decrementLive() {
        if (lives > 0) {
            lives--;
            health = originalHealth;
            if (lives <= 0) {
                System.out.println("This character is dead");
            }
        }
    }

    // Method to attack another player
    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
        playerToAttack.checkHealth();
    }

    // Method to check health and call decrementLive() if health is 0 or less
    public void checkHealth() {
        if (this.health <= 0) {
            decrementLive();
        }
    }
}

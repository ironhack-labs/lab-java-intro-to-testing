package exercise3;

abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int initialHealth;

    //Constructor
    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
        initialHealth = health;
    }

    //Getters
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    //Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    //Methods
    // Methods
    public void decrementLive() {
        if (lives <= 0) {
            System.out.println("This character is dead");
        } else {
            lives--;
            setHealth(initialHealth);
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - strength);
    }

    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}

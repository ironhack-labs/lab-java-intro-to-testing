import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Player {
    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        initialHealth = health;
    }

    private final int initialHealth;
    private int health;
    private int strength;
    private int lives;

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - strength);
        playerToAttack.checkHealth();
    }

    public void decrementLive(){
        lives--;
        health = 3;
        if (lives <= 0) System.out.println("This character is dead");
    }

    public void checkHealth() {
        if (health <= 0) decrementLive();
    }

}

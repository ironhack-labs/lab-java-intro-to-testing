import lombok.*;

@Getter
public class Elf extends Player {

    public static final int DEFAULT_SPEED = 10;

    private int speed;

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        this.speed = speed;
    }

    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);
        this.speed = DEFAULT_SPEED;
    }
}

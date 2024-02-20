import lombok.Getter;

@Getter
public class Warrior extends Player {

    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public Elf convertToElf(){
        return new Elf(getHealth(), getStrength(), getLives());
    }

}

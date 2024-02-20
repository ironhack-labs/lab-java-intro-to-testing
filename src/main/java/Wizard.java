import lombok.Getter;



@Getter
public class Wizard extends Player {

    private int spell;

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public Elf convertToElf(){
        return new Elf(getHealth(), getStrength(), getLives());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wizard wizard = (Wizard) o;
        return spell == wizard.spell;
    }

}

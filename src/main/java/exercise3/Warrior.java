package exercise3;

class Warrior extends Player {
    final int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    //Getter
    public int getForce() {
        return force;
    }

    // Method
    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), 0);
    }
}

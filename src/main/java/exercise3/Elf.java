package exercise3;

class Elf extends Player {
    final int speed;

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        this.speed = speed;
    }

    //Getters

    public int getSpeed() {
        return speed;
    }
}


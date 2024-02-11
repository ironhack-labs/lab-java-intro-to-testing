package ex3;


abstract class Player{
    private int health;
    private int strenght;
    private int lives;

    public Player(int health, int strenght, int lives){
        this.health = 100;
        setStrenght(strenght);
        setLives(lives);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLive(){
        lives -= 1;
        health = 100;
    }

    public void attack(Player playerToAttack){
        playerToAttack.health -= strenght;
    }

    public boolean checkHealth(){
        if (getHealth() == 0){
            decrementLive();
        }
        return false;
    }

}


class Elf extends Player{
    private int speed;
    public Elf(int health, int strength, int lives){
        super(health, strength, lives);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Warrior extends Player{
    public Warrior(int health, int strength, int lives){
        super(health, strength, lives);
    }

    public Elf convertToElf(int speed){
        Elf elf = new Elf(getHealth(), getStrenght(), getLives());
        elf.setSpeed(speed);
        return elf;
    }
}

class Wizard extends Player{
    public Wizard(int health, int strength, int lives){
        super(health, strength, lives);
    }

    public Elf spell(int speed){
        Elf elf = new Elf(getHealth(), getStrenght(), getLives());
        elf.setSpeed(speed);
        return elf;
    }
}



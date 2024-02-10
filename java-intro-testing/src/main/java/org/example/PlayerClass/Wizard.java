package org.example.PlayerClass;

public class Wizard extends Player {
    private int spell;
    final private int initialHealth;
    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        setSpell(spell);
        initialHealth = health;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public void decrementLive() {
        setHealth(initialHealth);
        super.setLives(super.getLives()-1);
        if(getLives()<=0){
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth()-getStrength());
    }

    public void checkHealth() {
        if(getHealth()<=0){
            decrementLive();
        }
    }

    public Elf convertToElf(){
        Elf elf = new Elf(getHealth(),getStrength(),getLives(),getSpell());
        return elf;
    }
}

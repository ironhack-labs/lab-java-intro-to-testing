public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior(100, 20, 3,40);
        Warrior warrior2 = new Warrior(80, 15, 2,60);

        warrior1.attack(warrior2);
        System.out.println("Warrior2 Health: " + warrior2.getHealth());
        System.out.println("Warrior2 Lives: " + warrior2.getLives());

        warrior2.attack(warrior1);
        System.out.println("Warrior1 Health: " + warrior1.getHealth());
        System.out.println("Warrior1 Lives: " + warrior1.getLives());
    }
}

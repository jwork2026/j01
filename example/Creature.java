package example;

public class Creature extends Being {

    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature(String name) {
        super(name);
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(this.name + " told " + creature + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(this.name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
        memoryOffset++;
    }

    public void attack(Creature creature) {
        System.out.println(this.name + " attacked " + creature + " of " + attack + "points");
        creature.receiveAttack(attack);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(this.name + " got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(this.name + " is dead");
            return true;
        }

        return false;
    }

    public void move() {

        // not implemented yet

    }

}

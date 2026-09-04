package example;

public class Monster extends Creature {

    int magic;

    Monster(String name, int hp, int ap, int dp, int mp) {
        super(name);
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature c) {
        int damage = attack * magic;
        System.out.println(this.name + " attack " + c + " of " + damage + "points");
        c.receiveAttack(damage);
    }

    public void rolleyes() {
        System.out.println(this.name + " roll my eyes. ");
    }

    public void bePissed() {
        System.out.println(this.name + " is so freakin pissed. ");
    }

}

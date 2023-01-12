package patternFactory;

public class EnemySoldier {



    private String name;
    private int damage;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void doSomething(){
        System.out.println(getName() + " is doing something");
    }
    public void shoot(){
        System.out.println(getName() + "is attacking and does " + getDamage());
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

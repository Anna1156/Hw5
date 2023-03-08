public class Mage extends Person{
   int health = 100;
   int protection = 15;
    Mage(String name) {
        super(name);
        System.out.println(name + ": " + "health: " + health + ",protection: " + protection);
    }
    void announce() {
        super.announce();
    }
    void  takeDamage() {
        super.takeDamage(10);
        System.out.println(health - 1);
        System.out.println(health - (damage - protection + health % 10) + "Random buff");
    }
    int fireBall() {
        System.out.println(health - 45);
        return health;
    }
}

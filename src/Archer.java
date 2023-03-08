public class Archer extends Person{
    int health = 120;
    int protection = 12;
    Archer(String name) {
        super(name);
        System.out.println(name + ": " + "health: " + health + ",protection: " + protection);
    }
    void announce() {
        super.announce();
    }
    void  takeDamage() {
        super.takeDamage(10);
        System.out.println(health - 1);
        System.out.println(health - (damage - protection + health % 10) + "Random debuff");
    }
    int shootBow() {
        System.out.println(health - (40 + health % 10));
        return health;
    }
}

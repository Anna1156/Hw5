public class Person extends  Exception {
    String name;
    int protection;
    int health;
    int damage = 10;

    Person(String parametr) {
        if (parametr.equals("DEFAULT")) {
            protection = 0;
            health = 50;
        }
    }

    protected void pers() {
        System.out.println(protection + health);
        try {
            if (protection < 0) throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if (health < 0) throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (health < 0) System.out.println("Dead");
    }

    private void name() {
        System.out.println(name);
    }

    void announce()  {
        System.out.println("Person: " + name + protection + health);
    }

    void takeDamage(int damage) {
        System.out.println("Health" + (damage - protection));
    }

    int facePunch() {
        System.out.println(health - 1);
        return health;
    }

    }

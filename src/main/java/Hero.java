import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;


public class Hero {
    private final String name;
    private final int age;
    private final String specialPower;
    private final String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private final int id;


    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public static void clear() {
        instances.clear();
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public static ArrayList<Hero> getInstances() {
        return instances;
    }

    public int getId() {
        return id;
    }
}

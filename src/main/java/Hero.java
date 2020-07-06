import java.util.ArrayList;
import java.util.Queue;


public class Hero {
    private final String name;
    private final int age;
    private final String specialPower;
    private final String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();


    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
    }

    public static void clear() {
        instances.clear();
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
}

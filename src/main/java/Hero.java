import java.util.ArrayList;

public class Hero {
    private final String name;
    private final int age;

    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

import javax.swing.*;
import java.util.ArrayList;
import java.util.Queue;

public class Squad {
    private final int size;
    private final String squadName;
    private final String cause;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();


    public Squad(int size, String squadName, String cause) {
        this.size = size;
        this.squadName = squadName;
        this.cause = cause;
        instances.add(this);
    }

    public static ArrayList<Squad> getInstances() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getSize() {
        return size;
    }

    public String getSquadName() {
        return squadName;
    }

    public String getCause() {
        return cause;
    }
}

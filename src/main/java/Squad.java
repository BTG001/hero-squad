import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

public class Squad {
    private final int size;
    private final String squadName;
    private final String cause;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();
    private final int id;


    public Squad(int size, String squadName, String cause) {
        this.size = size;
        this.squadName = squadName;
        this.cause = cause;
        instances.add(this);
        this.id = instances.size();
    }

    public static ArrayList<Squad> getInstances() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public static Squad findById(int id) {
        return instances.get(id-1);
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

    public int getId() {
        return id;
    }
}

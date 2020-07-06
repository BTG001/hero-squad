import java.util.ArrayList;

public class Squad {
    private final int size;
    private final String squadName;

    public Squad(int size, String squadName, String cause) {
        this.size = size;
        this.squadName = squadName;
    }

    public int getSize() {
        return size;
    }

    public String getSquadName() {
        return squadName;
    }
}

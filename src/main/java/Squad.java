import java.util.ArrayList;

public class Squad {
    private final int size;
    private final String squadName;
    private final String cause;

    public Squad(int size, String squadName, String cause) {
        this.size = size;
        this.squadName = squadName;
        this.cause = cause;
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

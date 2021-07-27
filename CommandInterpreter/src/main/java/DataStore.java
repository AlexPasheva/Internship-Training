import java.util.*;
/**
 * DataStore class works as a memory unit for the command interpreter
 */
public class DataStore {
    private final Map<String, Pair<String, String>> memory = new HashMap<String, Pair<String, String>>();

    public Pair<String, String> getValueAndTypeByName(String name) {
        return memory.get(name);
    }
    public void putVariable(String name, String type, String value) {
        memory.put(name, new Pair<String, String> (type, value));
    }
}

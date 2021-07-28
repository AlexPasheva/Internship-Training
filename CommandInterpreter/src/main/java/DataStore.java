import java.util.*;
/**
 * DataStore class works as a memory unit for the command interpreter
 */
public class DataStore {
    private final Map<String, Variable> memory = new HashMap<String, Variable>();
    private DataEngine engine;
    public Variable getVariable(String name) {
        return memory.get(name);
    }
    /**
     * This method puts the variable into the memory
     *
     * @param  name   the name of the variable
     * @param  type   the type of the variable
     * @param  value  the value of the variable
     * @throws        IllegalArgumentException if the type of the variable
     *                does not exist in the map of available variables.
     */
    public void putVariable(String name, String type, String value) {
        Variable var = engine.findVariable(type);
        var.setValue(value);
        memory.put(name,var);
    }
}

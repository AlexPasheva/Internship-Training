import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataEngine {
    private final Map<String, Variable> types = new HashMap<>();

    private void fillMap() {
        List<Variable> variableList = Arrays.asList(new NumberVar(), new StringVar());
        for (Variable var: variableList) {
            types.put(var.getType(), var);
        }
    }
    /**
     * This method can finds and returns the right variable obj by passing it's type
     *
     * @param  type  the type of the variable
     * @return       the right command object
     * @throws       IllegalArgumentException if the type of the variable
     *               does not exist in the map of available variables.
     */
    public Variable findVariable(String type) {
        fillMap();
        if(types.containsKey(type)) {
            return types.get(type);
        } else {
            throw new IllegalArgumentException("No type " + type);
        }
    }
}

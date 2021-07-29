import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFactory {
    private final Map<String, VariableFactory> types = new HashMap<>();
    public DataFactory(){
        fillMap();
    }
    public Variable create(String type, String value) {
        if(types.containsKey(type)) {
            return types.get(type).create(value);
        } else {
            throw new IllegalArgumentException("No type " + type);
        }
    }
    private void fillMap() {
        List<VariableFactory> variableFactories = Arrays.asList(new NumberFactory(),
                new StringFactory());
        for (VariableFactory var: variableFactories) {
            types.put(var.getType(), var);
        }
    }
}

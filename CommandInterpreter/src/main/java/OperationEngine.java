import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationEngine {
    private final Map<String, Operation> operations = new HashMap<>();

    private void fillMap() {
        List<Operation> operationList = Arrays.asList(new Addition(), new Subtraction(), new Multiplication());
        for (Operation operation: operationList) {
            operations.put(operation.getName(), operation);
        }
    }

    public Variable execute(String operation, Variable var1, Variable var2) {
        fillMap();
        if(operations.containsKey(operation)) {
            return operations.get(operation).execute(operation, var1, var2);
        } else {
            throw new IllegalArgumentException("No operation " + operation);
        }
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationsFactory {
    private final Map<OperationKeyForHash, Operation> types = new HashMap<>();
    public OperationsFactory(){
        fillMap();
    }
    public Variable execute(OperationKeyForHash key, Variable operand1, Variable operand2) {
        if(types.containsKey(key)) {
            return types.get(key).execute(operand1, operand2);
        } else {
            throw new IllegalArgumentException("Wrong operation");
        }
    }
    private void fillMap() {
        List<Operation> operations = Arrays.asList(new StringAddition(), new StringMultiplication(),
                new NumberAddition(), new NumberMultiplication(), new NumberSubtraction());
        for (Operation operation: operations) {
            types.put(operation.getOperation(), operation);
        }
    }
}

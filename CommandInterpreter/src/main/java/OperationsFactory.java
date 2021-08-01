import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationsFactory {
    private final Map<OperationKeyForHash, OperationFactory> types = new HashMap<>();
    public OperationsFactory(){
        fillMap();
    }
    public Operation create(OperationKeyForHash key, Variable operand1, Variable operand2) {
        if(types.containsKey(key)) {
            return types.get(key).create(operand1, operand2);
        } else {
            throw new IllegalArgumentException("Wrong operation");
        }
    }
    private void fillMap() {
        List<OperationFactory> operationFactories = Arrays.asList(new StringAdditionFactory(), new StringMultiplicationFactory(),
                new NumberAdditionFactory(), new NumberMultiplicationFactory(), new NumberSubtractionFactory());
        for (OperationFactory operationFactory: operationFactories) {
            types.put(operationFactory.getType(), operationFactory);
        }
    }
}

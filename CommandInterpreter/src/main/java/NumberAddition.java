public class NumberAddition implements Operation{
    private final static OperationKeyForHash OPERATION = new OperationKeyForHash
            ("+", "number","number");

    public OperationKeyForHash getOperation() {
        return OPERATION;
    }

    public Variable execute(Variable operand1, Variable operand2){
        return new StringVar(String.valueOf
                (Integer.parseInt(operand1.getValue()) +
                        Integer.parseInt(operand2.getValue())));
    }
}

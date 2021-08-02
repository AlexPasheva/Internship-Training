public class StringAddition implements Operation{
    private final static OperationKeyForHash OPERATION = new OperationKeyForHash
            ("+", "string","numbe");

    public OperationKeyForHash getOperation() {
        return OPERATION;
    }

    public Variable execute(Variable operand1, Variable operand2){
        String res = operand1.getValue() + operand2.getValue();
        return new StringVar(res);
    }
}

public class StringAdditionFactory implements OperationFactory{
    private final static OperationKeyForHash TYPE = new OperationKeyForHash
            ("+", new StringVar(""),  new NumberVar(""));
    public Operation create(Variable operand1, Variable operand2 ) {
        return new StringAddition(operand1, operand2);
    }
    public OperationKeyForHash getType() {
        return TYPE;
    }
}

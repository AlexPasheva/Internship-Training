public class NumberMultiplicationFactory implements OperationFactory{
    private final static OperationKeyForHash TYPE = new OperationKeyForHash
            ("*", new NumberVar(""),  new NumberVar(""));
    public Operation create(Variable operand1, Variable operand2 ) {
        return new NumberMultiplication(operand1, operand2);
    }
    public OperationKeyForHash getType() {
        return TYPE;
    }
}

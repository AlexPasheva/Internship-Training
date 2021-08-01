
public interface OperationFactory {
    public Operation create(Variable operand1, Variable operand2);
    public OperationKeyForHash getType ();
}

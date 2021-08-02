public interface Operation {
    OperationKeyForHash getOperation();
    Variable execute(Variable operand1, Variable operand2);
}

public class StringMultiplication implements Operation{
    private final static OperationKeyForHash OPERATION = new OperationKeyForHash
            ("*", "string","number");

    public OperationKeyForHash getOperation() {
        return OPERATION;
    }

    public Variable execute(Variable operand1, Variable operand2){
        String res="";
        for (int i = 0; i < Integer.parseInt(operand2.getValue()); i++) {
            res+=operand1.getValue();
        }
        return new StringVar(res);
    }
}

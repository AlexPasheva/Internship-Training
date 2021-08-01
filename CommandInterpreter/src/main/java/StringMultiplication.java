public class StringMultiplication implements Operation{
    private static final String NAME = "*";
    private Variable operand1;
    private Variable operand2;
    public StringMultiplication(Variable operand1, Variable operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public String getOperation(){
        return NAME;
    }
    public Variable getOperand1(){
        return operand1;
    }
    public Variable getOperand2(){
        return operand2;
    }
    public Variable execute(){
        String res="";
        for (int i = 0; i < Integer.parseInt(operand2.getValue()); i++) {
            res+=operand1.getValue();
        }
        return new StringVar(res);
    }
}

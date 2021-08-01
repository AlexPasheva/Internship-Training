public class NumberMultiplication implements Operation{
    private static final String NAME = "*";
    private Variable operand1;
    private Variable operand2;
    public NumberMultiplication(Variable operand1, Variable operand2){
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
        return new StringVar(String.valueOf
                (Integer.parseInt(operand1.getValue()) *
                        Integer.parseInt(operand2.getValue())));
    }
}

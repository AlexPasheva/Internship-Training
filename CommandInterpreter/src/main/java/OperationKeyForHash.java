public class OperationKeyForHash {
    private final String operation;
    private final Variable operand1;
    private final Variable operand2;
    public OperationKeyForHash(String operation, Variable operand1, Variable operand2){
        this.operand1=operand1;
        this.operand2=operand2;
        this.operation=operation;
    }

    public String getOperation() {
        return operation;
    }

    public Variable getOperand2() {
        return operand2;
    }

    public Variable getOperand1() {
        return operand1;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime * 1;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Operation other = (Operation) obj;
        if (operation != other.getOperation()){
            return false;
        }
        if(operand1.getType()=="number" && operand2.getType() == operand1.getType()){
            return true;
        }
        if(operand1.getType()=="string"){
            if(operation=="+" && (operand2.getType()=="string" || operand2.getType()=="number")){
                return true;
            }
            if(operation=="*" && operand2.getType() == "number"){
                return true;
            }
        }
        return false;
    }
}

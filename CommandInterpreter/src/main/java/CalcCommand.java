public class CalcCommand implements Command{
    private static final String NAME = "calc";
    private DataStore data;

    CalcCommand(DataStore data) {
        this.data = data;
    }
    @Override

    public String execute(String input){
        OperationsFactory factory = new OperationsFactory();
        String[] attributes = input.split("\\s");
        attributes = input.trim().split("\\s+");
        String saveHere = attributes[0];
        String operand1 = attributes[1];
        String operation = attributes[2];
        String operand2 = attributes[3];
        Variable varOperand1 = data.getVariable(operand1);
        Variable varOperand2 = data.getVariable(operand2);
        if(varOperand1==null || varOperand2==null) {
            return "Err";
        }
        try {
            OperationKeyForHash key = new OperationKeyForHash(operation, varOperand1, varOperand2);
            Operation resOp = factory.create(key, varOperand1, varOperand2);
            Variable result = resOp.execute();
            data.putVariable(saveHere, result.getType(), result.getValue());
            return new String("OK");
        }
        catch (Exception e){
            return "Err";
        }
    }

    public String getName() {
        return NAME;
    }
}

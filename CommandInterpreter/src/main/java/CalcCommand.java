public class CalcCommand implements Command{
    private static final String NAME = "calc";
    private DataStore data;

    CalcCommand(DataStore data) {
        this.data = data;
    }
    @Override

    public String execute(String input){
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
        OperationEngine engine = new OperationEngine();
        Variable result = engine.execute(operation, varOperand1, varOperand2);
        Variable valueToSave = data.getVariable(saveHere);
        valueToSave.setValue(result.getValue());
        data.putVariable(saveHere, valueToSave.getType(), valueToSave.getValue());
        return new String("OK");
    }

    public String getName() {
        return NAME;
    }
}

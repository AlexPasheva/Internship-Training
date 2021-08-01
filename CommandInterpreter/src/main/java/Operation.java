public interface Operation {
    String getOperation();
    Variable getOperand1();
    Variable getOperand2();
    Variable execute();
}

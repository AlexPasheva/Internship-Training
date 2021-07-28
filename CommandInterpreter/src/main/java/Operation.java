public interface Operation {
    Variable execute(String operation, Variable operand1, Variable operand2);
    String getName();
}

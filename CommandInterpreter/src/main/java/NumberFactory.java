public class NumberFactory implements VariableFactory{
    private final static String TYPE = "number";
    public Variable create(String value) {
        return new NumberVar(value);
    }
    public String getType() {
        return TYPE;
    }
}

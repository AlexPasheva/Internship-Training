public class StringFactory implements VariableFactory{
    private final static String TYPE = "string";
    public Variable create(String value){
        return new StringVar(value);
    }
    public String getType() {
        return TYPE;
    }
}

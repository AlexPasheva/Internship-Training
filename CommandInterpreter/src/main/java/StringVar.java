public class StringVar implements Variable {
    private final static String TYPE = "string";
    private String value;

    public StringVar(String value){
        this.value = value;
    }
    public String getType() {
        return TYPE;
    }
    public String getValue() {
        return value;
    }
}

public class StringVar implements Variable {
    private final static String TYPE = "string";
    private String value;

    public String getType() {
        return TYPE;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}

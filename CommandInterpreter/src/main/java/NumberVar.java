public class NumberVar implements Variable{
    private final static String TYPE = "number";
    private int value;

    public String getType() {
        return TYPE;
    }

    public void setValue(String value) {
        this.value = Integer.parseInt(value);
    }

    public String getValue() {
        return Integer.toString(value);
    }
}

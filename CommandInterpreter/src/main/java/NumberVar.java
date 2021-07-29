public class NumberVar implements Variable{
    private final static String TYPE = "number";
    private int value;

    public NumberVar(String value){
        this.value = Integer.valueOf(value);
    }
    public String getType() {
        return TYPE;
    }

    public String getValue() {
        return Integer.toString(value);
    }
}

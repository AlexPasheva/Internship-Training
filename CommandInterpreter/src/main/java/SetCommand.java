import java.util.StringTokenizer;

/**
 * Implementation of the get command
 */
public class SetCommand implements Command{
    private static final String NAME = "get";
    private DataStore data;

    SetCommand(DataStore data) {
        this.data = data;
    }
    @Override
    /**
     * This method executes the set command as it sets the value and the type
     * of the given variable.
     *
     * @param  input  the name, type and value of the variable
     * @return        the result of the execution as a string
     */
    public String execute(String input){
        String[] attributes = input.split("\\s+");
        String name = attributes[0];
        String type = attributes[1];
        String value = attributes[2];
        data.putVariable(name, type, value);
        return new String("OK");
    }

    public String getName() {
        return NAME;
    }
}


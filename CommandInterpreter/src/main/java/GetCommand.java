
/**
 * Implementation of the get command
 */
public class GetCommand implements Command{
    private static final String NAME = "get";
    private DataStore data;

    GetCommand(DataStore data) {
        this.data = data;
    }
    @Override
    /**
     * This method executes the get command as it obtains the value of
     * the given variable and prints it out in the format:
     *      [<type>] <value>
     * and Err if there is no such variable
     *
     * @param  input  the name of the variable that must be obtained
     * @return        the result of the execution as a string
     */
    public String execute(String input){
        Pair<String, String> typeAndValue = data.getValueAndTypeByName(input);
        if(typeAndValue==null) {
            return "Err";
        }
        return new String("[" + typeAndValue.getFirst() + "] " + typeAndValue.getSecond());
    }

    public String getName() {
        return NAME;
    }
}

/**
 * Implementation of the reverse command
 */
public class ReverseCommand implements Command{
    private static final String NAME = "reverse";
    @Override
    /**
     * This method executes the reverse command and returns as a result
     * a string with the input written backwards.
     *
     * @param  input  the string that is going to be reversed
     * @return        the result of the execution as a string
     */
    public String execute(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public String getName() {
        return NAME;
    }
}
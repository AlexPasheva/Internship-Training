import java.util.*;

/**
 * Implementation of the count-words command
 */
public class CountWordsCommand implements Command{
    private static final String NAME = "count-words";
    @Override
    /**
     * This method executes the count-words command and returns as a result
     * a string with the number of words the input has.
     *
     * @param  input  the string that is going to be word-counted
     * @return        the result of the execution as a string
     */
    public String execute(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        int count = st.countTokens();
        return String.valueOf(count);
    }

    public String getName() {
        return NAME;
    }
}

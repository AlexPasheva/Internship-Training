import java.util.*;

/**
 * Implementation of the reverse-words command
 */
public class ReverseWordsCommand implements Command{
    private static final String NAME = "reverse-words";
    @Override
    /**
     * This method executes the reverse-words command and returns as a result
     * a string with the words of the input but in reversed order.
     *
     * @param  input  the string that is going to be reversed by words
     * @return        the result of the execution as a string
     */
    public String execute(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        String reversedLine = "";

        while(st.hasMoreTokens()) {
            reversedLine = st.nextToken() + " " + reversedLine;
        }
        return reversedLine;
    }

    public String getName() {
        return NAME;
    }
}

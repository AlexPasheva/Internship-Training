import java.util.*;
public class CountWordsCommand implements Command{
    String name = "count-words";
    @Override
    /**
     * Returns the result of the execution of a count-words command.
     *
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
        return name;
    }
}

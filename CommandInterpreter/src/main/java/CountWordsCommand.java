import java.util.*;
public class CountWordsCommand implements Command{
    String name = "count-words";
    @Override
    public String execute(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        int count = st.countTokens();
        return String.valueOf(count);
    }

    public String getName() {
        return name;
    }
}

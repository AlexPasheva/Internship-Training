import java.util.*;
public class ReverseWordsCommand implements Command{
    String name = "reverse-words";
    @Override
    public String execute(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        String reversedLine = "";

        while(st.hasMoreTokens()) {
            reversedLine = st.nextToken() + " " + reversedLine;
        }
        return reversedLine;
    }

    public String getName() {
        return name;
    }
}

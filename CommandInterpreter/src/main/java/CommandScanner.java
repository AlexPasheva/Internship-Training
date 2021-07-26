import java.util.*;
import java.util.StringTokenizer;

/**
 * A scanner for reading command lines
 */
public class CommandScanner {
    private Scanner scanner;
    CommandScanner(Scanner scanner){
        this.scanner = scanner;
    }
    /**
     * This method reads a line from the sin parses it and returns it as a list of tokens.
     *
     * @return    Parsed input from the scanner
     * @throws    IllegalArgumentException if it doesn't find the requested command.
     */
    public ArrayList<String> scan() {
        ArrayList<String> nameAndArguments = new ArrayList<String>();
        String name="";
        String arguments="";
        boolean Switch=true;
        while(Switch) {
            //System.out.print("Enter your command:");
            String input = this.scanner.nextLine();
            StringTokenizer st = new StringTokenizer(input, "/s+");
            name += st.nextToken();
            nameAndArguments.add(name);
            if(name == "stop") {
                Switch = false;
                break;
            }
            while (st.hasMoreTokens()) {
                arguments += " " + st.nextToken();
            }
            nameAndArguments.add(name + arguments);
        }
        return nameAndArguments;
    }

}

import java.util.*;
import java.util.StringTokenizer;

public class CommandScanner {
    private Scanner scanner;
    CommandScanner(Scanner scanner){
        this.scanner = scanner;
    }
    /**
     * Returns an Array of Strings. The first word is the name of the command and the
     * rest of the string are the arguments.
     *
     * This method is going to be executed no matter if the commands exist or not.
     * The method stops when as a name of command is given "stop". Every new command
     * and it's arguments should be entered after new line with spaces between them.
     *
     * @return    Parsed input from the scanner
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

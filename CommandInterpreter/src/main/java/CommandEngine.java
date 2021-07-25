import java.util.*;

public class CommandEngine {
    private final Map<String, Command> Commands = new HashMap<String, Command>();
    private void fillMap() { //pulnene ne taka??
        this.Commands.put("reverse", new ReverseCommand());
        this.Commands.put("reverse-words", new ReverseCommand());
        this.Commands.put("count-words", new ReverseCommand());
    }
    private Command findCommand(String commandName){
        if(Commands.containsKey(commandName)) {
            return Commands.get(commandName);
        } else {
            throw new IllegalArgumentException("No command " + commandName);
        }
    }
    public String execute(String commandName, String arguments) {
        fillMap();
        Command toBeExecuted = findCommand(commandName);
        return toBeExecuted.execute(arguments);
    }
}
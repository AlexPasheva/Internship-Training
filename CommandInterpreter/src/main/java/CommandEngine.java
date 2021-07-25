import java.util.*;

public class CommandEngine {
    private final Map<String, Command> Commands = new HashMap<String, Command>();
    /**
     * This method fills the map with available commands and is completely wrong
     */
    private void fillMap() {
        this.Commands.put("reverse", new ReverseCommand());
        this.Commands.put("reverse-words", new ReverseCommand());
        this.Commands.put("count-words", new ReverseCommand());
    }
    /**
     * Returns a Command object if it exists in the map
     *
     * This method can throw an Illegal Argument Exception if the name of the command
     * does not exist in the map of available commands. If the command exists then an
     * instance of a command with the same name is returned.
     *
     * @param  commandName  the name of the command
     * @return              the right command object
     */
    private Command findCommand(String commandName){
        if(Commands.containsKey(commandName)) {
            return Commands.get(commandName);
        } else {
            throw new IllegalArgumentException("No command " + commandName);
        }
    }
    /**
     * Returns the result of the execution of a given command
     *
     * This method can throw an Illegal Argument Exception that comes from trying to
     * find the command name in the map of available commands. If the command is
     * found on the map then it's going to executed and the result of the execution
     * is going to be returned as a string
     *
     * @param  commandName the name of the command that is going to be executed
     * @param  arguments   the arguments that the command is going to be executed on
     * @return             the result of the execution as a string
     */
    public String execute(String commandName, String arguments) {
        fillMap();
        Command toBeExecuted = findCommand(commandName);
        return toBeExecuted.execute(arguments);
    }
}

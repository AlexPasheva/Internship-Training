import java.util.*;

/**
 * An engine that executes the commands
 */
public class CommandEngine {
    private final Map<String, Command> commands = new HashMap<String, Command>();
    /**
     * This method fills the map with available commands and is completely wrong
     */
    private void fillMap() {
        List<Command> commandList = Arrays.asList(new ReverseCommand(),
                                                  new ReverseWordsCommand(),
                                                  new CountWordsCommand());
        for (Command cmd: commandList) {
            commands.put(cmd.getName(), cmd);
        }
    }
    /**
     * This method can finds and returns the right command obj by passing it's name
     *
     * @param  commandName  the name of the command
     * @return              the right command object
     * @throws              IllegalArgumentException if the name of the command
     *                      does not exist in the map of available commands.
     */
    private Command findCommand(String commandName){
        if(commands.containsKey(commandName)) {
            return commands.get(commandName);
        } else {
            throw new IllegalArgumentException("No command " + commandName);
        }
    }
    /**
     * This method executes the command
     *
     * @param  commandName the name of the command that is going to be executed
     * @param  arguments   the arguments that the command is going to be executed on
     * @return             the result of the execution as a string
     * @throws              IllegalArgumentException if a command with that name does not exists
     */
    public String execute(String commandName, String arguments) {
        fillMap();
        Command toBeExecuted = findCommand(commandName);
        return toBeExecuted.execute(arguments);
    }
}

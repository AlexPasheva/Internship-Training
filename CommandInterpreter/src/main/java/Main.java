import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * This method executes the entered commands in the sin
     *
     * @throws              IllegalArgumentException if the command with that name
     *                      does not exist.
     */
    public void CommandExecutor(){
        CommandScanner scanned = new CommandScanner(new Scanner(System.in));
        ArrayList<String> input = scanned.scan();
        CommandEngine engine = new CommandEngine();
        String name = "";
        String arguments = "";
        String line = "";

        for (int i=0; i<input.size(); i++) {

            line = input.get(i);
            int index = line.indexOf(' ');
            name = line.substring(0, index);
            arguments = line.substring(index);

            try {
                engine.execute(name, arguments);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void main(String[] args) {
        CommandExecutor();
    }
}
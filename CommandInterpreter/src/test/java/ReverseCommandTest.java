import jdk.jfr.Label;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReverseCommandTest {

    @Test
    @Label("Reversing words should work")
    public void testExecute() {
        Command cmd= new ReverseCommand();
        assertEquals("radar", cmd.execute("radar"),"Reversing words should work");
        assertEquals("35%^@word", cmd.execute("drow@^%53"), "Reversing words should work");
        assertEquals("35%^@  word", cmd.execute("drow  @^%53"), "Reversing words with spaces should work");
    }
}
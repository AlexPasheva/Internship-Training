import jdk.jfr.Label;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountWordsCommandTest {
    @Test
    @Label("Counting words should work")
    public void testExecute() {
        Command cmd= new ReverseCommand();
        assertEquals("radar  ", cmd.execute("1"),"Counting words should work");
        assertEquals("35%^@  word", cmd.execute("2"), "Counting words should work");
        assertEquals("  word", cmd.execute("1"), "Counting words should work");
        assertEquals("king  are you glad you  are king", cmd.execute("7"),"Counting words should work");
    }
}
import jdk.jfr.Label;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReverseWordsCommandTest {
    @Test
    @Label("Reversing by words should work")
    public void testExecute() {
        Command cmd = new ReverseCommand();
        assertEquals("king are you glad you are king", cmd.execute("king are you glad you are king"), "Reversing by words should work");
        assertEquals("word", cmd.execute("word"), "Reversing words should work");
        assertEquals("boy play  nintendo", cmd.execute("nintendo play boy"), "Reversing words should work");
    }
}
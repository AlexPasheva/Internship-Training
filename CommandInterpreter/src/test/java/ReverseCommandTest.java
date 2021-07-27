import jdk.jfr.Label;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReverseCommandTest {
    @DataProvider
    public Object[][] testEntityDataProvider() {
        return new Object[][] {
                {"radar", "radar  "},
                {"35%^@word", "drow@^%53"},
                {"35%^@  word", "drow @^%53"},
                {"", ""},
        };
    }
    @Test
    @Label("Reversing words should work")
    public void testExecute(String result, String input) {
        final Command cmd = new ReverseCommand();
        final String res = cmd.execute(input);
        assertEquals(res, result);
    }
}

import jdk.jfr.Label;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountWordsCommandTest {
    @DataProvider
    public Object[][] testEntityDataProvider() {
        return new Object[][] {
                {"1", "radar  "},
                {"2", "35%^@  word"},
                {"1", "  word    "},
                {"7", "king  are you glad you  are king"},
                {"0", ""},
        };
    }
    @Test (dataProvider = "testEntityDataProvider")
    @Label ("Counting words should work")
    public void testExecute(String result, String input) {
        final Command cmd = new CountWordsCommand();
        final String res = cmd.execute(input);
        assertEquals(res, result);
    }
}
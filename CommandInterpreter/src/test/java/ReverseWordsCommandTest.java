import jdk.jfr.Label;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReverseWordsCommandTest {
    @DataProvider
    public Object[][] testEntityDataProvider() {
        return new Object[][] {
                {"king are you glad you are king", "king are you glad you are king"},
                {"word", "word"},
                {"nintendo play boy", "  boy play  nintendo  "},
                {"", ""},
        };
    }

    @Test (dataProvider = "testEntityDataProvider")
    @Label ("Reversing by words should work")
    public void testExecute(String result, String input) {
        final Command cmd = new ReverseWordsCommand();
        final String res = cmd.execute(input);
        assertEquals(res, result);
    }
}
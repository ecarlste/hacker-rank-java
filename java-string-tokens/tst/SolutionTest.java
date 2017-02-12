import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private String input = "He is a very very good boy, isn't he?";
    private List<String> expectedTokens = new ArrayList<>(Arrays.asList(
            "He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he"
    ));

    @Test
    public void outputListShouldBeCorrectWhenPassedCorrectRegex() {
        List<String> actualTokens = Solution.splitStringIntoTokens(input);

        assertEquals(expectedTokens, actualTokens);
    }

    @Test
    public void outputListShouldBeCorrectSizeWhenInputContainsTrailingSpace() {
        input = input + " ";
        List<String> actualTokens = Solution.splitStringIntoTokens(input);

        assertEquals(expectedTokens, actualTokens);
    }

    @Test
    public void outputListShouldBeCorrectSizeWhenInputContainsLeadingSpace() {
        input = " " + input;
        List<String> actualTokens = Solution.splitStringIntoTokens(input);

        assertEquals(expectedTokens, actualTokens);
    }

    @Test
    public void outputListShouldBeEmptyWhenInputIsAllSpaces() {
        input = "                        ";
        List<String> actualTokens = Solution.splitStringIntoTokens(input);

        assertTrue(actualTokens.size() == 0);
    }

}

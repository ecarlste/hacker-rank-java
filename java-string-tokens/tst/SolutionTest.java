import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void outputListShouldBeCorrectWhenPassedCorrectRegex() {
        String input = "He is a very very good boy, isn't he?";
        List<String> expectedTokens = new ArrayList<>(Arrays.asList(
                "He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he"
        ));

        List<String> actualTokens = Solution.splitStringIntoTokens(input);

        Assert.assertEquals(expectedTokens, actualTokens);
    }

}

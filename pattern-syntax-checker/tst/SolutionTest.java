import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void checkRegularExpressionIsValidShouldReturnTrueWhenValid() throws Exception {
        String regex = "([A-Z])(.+)";
        boolean isValidRegex = Solution.checkRegularExpressionIsValid(regex);
        assertTrue(isValidRegex);
    }

    @Test
    public void checkRegularExpressionIsValidShouldReturnFalseWhenInvalid() {
        String regex = "[AZ[a-z](a-z)";
        boolean isValidRegex = Solution.checkRegularExpressionIsValid(regex);
        assertFalse(isValidRegex);
    }

}
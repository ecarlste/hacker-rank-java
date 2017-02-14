import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyRegexTest {

    @Test
    public void patternShouldMatchValidIPWithLeadingZeros() {
        String validRegex = "000.12.12.034";
        boolean isMatch = validRegex.matches(new MyRegex().pattern);
        assertTrue(isMatch);
    }

    @Test
    public void patternShouldMatchValidIPWithoutLeadingZeros() {
        String validRegex = "121.234.12.12";
        boolean isMatch = validRegex.matches(new MyRegex().pattern);
        assertTrue(isMatch);
    }

    @Test
    public void patternShouldMatchValidIPWhenAllAddressBytesOnlyTwoDigits() {
        String validRegex = "23.45.12.56";
        boolean isMatch = validRegex.matches(new MyRegex().pattern);
        assertTrue(isMatch);
    }

    @Test
    public void patternShouldNotMatchInvalidIPWhenContainsMoreThanFourBytes() {
        String validRegex = "00.12.123.123123.123";
        boolean isMatch = validRegex.matches(new MyRegex().pattern);
        assertFalse(isMatch);
    }

    @Test
    public void patternShouldNotMatchInvalidIPWhenContainsLessThanFourBytes() {
        String validRegex = "122.23";
        boolean isMatch = validRegex.matches(new MyRegex().pattern);
        assertFalse(isMatch);
    }

    @Test
    public void patternShouldNotMatchInvalidIPWhenContainsNonNumericCharacters() {
        String validRegex = "Hello.IP";
        boolean isMatch = validRegex.matches(new MyRegex().pattern);
        assertFalse(isMatch);
    }

}
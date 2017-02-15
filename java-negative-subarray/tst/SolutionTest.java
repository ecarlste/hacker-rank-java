import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getNegativeSubarrayCount() throws Exception {
        int[] values = {1, -2, 4, -5, 1};

        int expectedNegativeSubarrayCount = 9;
        int actualNegativeSubarrayCount = Solution.getNegativeSubarrayCount(values);

        assertEquals(expectedNegativeSubarrayCount, actualNegativeSubarrayCount);
    }

    @Test
    public void isNegativeSubarrayShouldReturnTrueWhenSumIsNegative() {
        int[] subarray = {-1, 4, -7};

        assertTrue(Solution.isNegativeSubarray(subarray));
    }

    @Test
    public void isNegativeSubarrayShouldReturnFalseWhenSumIsNotNegative() {
        int[] subarray = {-5, 10, -4};

        assertFalse(Solution.isNegativeSubarray(subarray));
    }

}
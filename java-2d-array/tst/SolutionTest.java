import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void findMaxHourglassSumFor2DArrayShouldReturnCorrectResultWithValidArray() throws Exception {
        int[][] inputArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int actualSum = Solution.findMaxHourglassSumFor2DArray(inputArray);
        int expectedSum = 19;

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void getHourglassSumFor2DArrayByIndexShouldReturnCorrectResultForValidHourglass() {
        int[][] inputArray = {
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        };
        int row = 1;
        int column = 1;

        int expectedSum = 7;
        int actualSum = Solution.getHourglassSumFor2DArrayByIndex(inputArray, row, column);

        assertEquals(expectedSum, actualSum);
    }

}
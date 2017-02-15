import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        int[] values = buildValuesArrayFromStdin();

        System.out.println(getNegativeSubarrayCount(values));
    }

    private static int[] buildValuesArrayFromStdin() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int[] values = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            values[i] = scanner.nextInt();
        }

        scanner.close();
        return values;
    }

    static int getNegativeSubarrayCount(int[] values) {
        int negativeSubarrayCount = 0;

        for (int subarraySize = 1; subarraySize <= values.length; subarraySize++) {
            negativeSubarrayCount += getNegativeSubarrayCountBySubarraySize(values, subarraySize);
        }

        return negativeSubarrayCount;
    }

    private static int getNegativeSubarrayCountBySubarraySize(int[] values, int subarraySize) {
        int negativeSubarrayCount;
        int maxStart = values.length - subarraySize;

        negativeSubarrayCount = (int) IntStream.rangeClosed(0, maxStart)
                                               .mapToObj(start -> Arrays.copyOfRange(
                                                       values, start, start + subarraySize))
                                               .filter(Solution::isNegativeSubarray).count();

        return negativeSubarrayCount;
    }

    static boolean isNegativeSubarray(int[] subarray) {
        int sumOfValues = IntStream.range(0, subarray.length).map(i -> subarray[i]).sum();

        return sumOfValues < 0;
    }
}

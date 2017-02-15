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

    static int getNegativeSubarrayCountBySubarraySize(int[] values, int subarraySize) {
        int negativeSubarrayCount = 0;
        int maxStart = values.length - subarraySize;

        for (int start = 0; start <= maxStart; start++) {
            int[] subarray = Arrays.copyOfRange(values, start, start + subarraySize);
            if (isNegativeSubarray(subarray)) {
                negativeSubarrayCount++;
            }
        }

        return negativeSubarrayCount;
    }

    static boolean isNegativeSubarray(int[] subarray) {
        int sumOfValues = IntStream.range(0, subarray.length).map(i -> subarray[i]).sum();

        return sumOfValues < 0;
    }
}

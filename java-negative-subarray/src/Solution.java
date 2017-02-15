import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] values = buildValuesArrayFromStdin();

        int negativeSubarrayCount = getNegativeSubarrayCount(values);
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

    private static int getNegativeSubarrayCount(int[] values) {
        return 0;
    }
}
